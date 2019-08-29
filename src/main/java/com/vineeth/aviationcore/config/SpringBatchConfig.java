package com.vineeth.aviationcore.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.json.JacksonJsonObjectReader;
import org.springframework.batch.item.json.JsonItemReader;
import org.springframework.batch.item.json.builder.JsonItemReaderBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.vineeth.aviationcore.model.TripDetails;

@Configuration
@EnableBatchProcessing
public class SpringBatchConfig {

	@Bean
	public Job job(JobBuilderFactory jobBuilderFactory, StepBuilderFactory stepBuilderFactory,
			ItemReader<TripDetails> itemReader, ItemProcessor<TripDetails, TripDetails> itemProcessor,
			ItemWriter<TripDetails> itemWriter) {

		Step step = stepBuilderFactory.get("json-file-load").<TripDetails, TripDetails>chunk(100).reader(itemReader)
				.processor(itemProcessor).writer(itemWriter).build();
		return jobBuilderFactory.get("json-load").incrementer(new RunIdIncrementer()).start(step).build();
	}

	@Bean
	public JsonItemReader<TripDetails> jsonItemReader() {
		return new JsonItemReaderBuilder<TripDetails>()
				.jsonObjectReader(new JacksonJsonObjectReader<>(TripDetails.class))
				.resource(new ClassPathResource("sample.json")).name("sampleJsonItemReader").build();
	}

}
