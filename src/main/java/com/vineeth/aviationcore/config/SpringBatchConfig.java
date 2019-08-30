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

import com.vineeth.aviationcore.model.Passengers;

@Configuration
@EnableBatchProcessing
public class SpringBatchConfig {

	@Bean
	public Job job(JobBuilderFactory jobBuilderFactory, StepBuilderFactory stepBuilderFactory,
			ItemReader<Passengers> itemReader, ItemProcessor<Passengers, Passengers> itemProcessor,
			ItemWriter<Passengers> itemWriter) {

		Step step = stepBuilderFactory.get("json-file-load").<Passengers, Passengers>chunk(1).faultTolerant()
				.skip(RuntimeException.class)
				.skipLimit(20)
				.reader(itemReader)
				.processor(itemProcessor).writer(itemWriter).build();
		return jobBuilderFactory.get("json-load").incrementer(new RunIdIncrementer()).start(step).build();
	}

	@Bean
	public JsonItemReader<Passengers> jsonItemReader() {
		return new JsonItemReaderBuilder<Passengers>()
				.jsonObjectReader(new JacksonJsonObjectReader<>(Passengers.class))
				.resource(new ClassPathResource("sample.json")).name("sampleJsonItemReader").build();
	}

}
