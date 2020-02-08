package com.escooter.michael.kroneder;

import com.escooter.michael.kroneder.entity.Flash;
import com.escooter.michael.kroneder.repository.FlashRepository;
import com.mongodb.reactivestreams.client.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class Application {

	@Bean
	CommandLineRunner account (FlashRepository flashRepository){

		return args -> {
			flashRepository.deleteAll()
					.subscribe(null,null,() -> {

						Stream.of(new Flash(UUID.randomUUID().toString(),"Peter",23.2),
								new Flash(UUID.randomUUID().toString(),"Hans",22.1),
								new Flash(UUID.randomUUID().toString(),"michael",23.3))
								.forEach(account -> {
									flashRepository
											.save(account)
											.subscribe(System.out::println);
								});
					});
		};

	}

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
