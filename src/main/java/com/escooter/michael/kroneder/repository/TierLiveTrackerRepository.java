package com.escooter.michael.kroneder.repository;

import com.escooter.michael.kroneder.entity.TierTracker;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TierLiveTrackerRepository extends ReactiveMongoRepository<TierTracker,String> {
}
