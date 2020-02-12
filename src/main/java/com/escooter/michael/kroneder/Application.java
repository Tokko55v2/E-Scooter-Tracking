package com.escooter.michael.kroneder;

import com.mongodb.reactivestreams.client.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;


@SpringBootApplication

public class Application {

	@Autowired
	MongoClient mongoClient;

	@Bean
	public ReactiveMongoTemplate reactiveMongoTemplate() {
		return new ReactiveMongoTemplate(mongoClient, "test");
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
