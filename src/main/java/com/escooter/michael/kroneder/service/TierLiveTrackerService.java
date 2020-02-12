package com.escooter.michael.kroneder.service;

import com.escooter.michael.kroneder.entity.TierTracker;
import reactor.core.publisher.Flux;

public interface TierLiveTrackerService {

    void save(TierTracker count);

    Flux<TierTracker> getAll();

}

