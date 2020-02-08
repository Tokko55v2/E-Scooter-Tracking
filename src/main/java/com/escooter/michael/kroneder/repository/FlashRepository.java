package com.escooter.michael.kroneder.repository;

import com.escooter.michael.kroneder.entity.Flash;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlashRepository extends ReactiveMongoRepository<Flash,String> {
}
