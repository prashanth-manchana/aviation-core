package com.vineeth.aviationcore;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableScheduling
@EnableBatchProcessing
public class AviationCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(AviationCoreApplication.class, args);
	}
}
