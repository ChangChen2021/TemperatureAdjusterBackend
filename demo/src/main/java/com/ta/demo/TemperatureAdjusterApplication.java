package com.ta.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.ta.demo")
public class TemperatureAdjusterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemperatureAdjusterApplication.class, args);
	}
}
