package com.escooter.michael.kroneder.service;

import com.escooter.michael.kroneder.entity.TierTracker;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TierLiveTrackerService {

    public void save(Mono<Integer> count);

    public Flux<TierTracker> getAll();

}

