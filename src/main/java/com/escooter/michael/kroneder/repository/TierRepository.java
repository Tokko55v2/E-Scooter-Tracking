package com.escooter.michael.kroneder.repository;

import com.escooter.michael.kroneder.entity.Tier;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TierRepository extends ReactiveMongoRepository<Tier,String> {
}
