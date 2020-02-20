package com.escooter.michael.kroneder.service;

import com.escooter.michael.kroneder.entity.TierScooters;
import reactor.core.publisher.Flux;

import java.util.List;

public interface TierScooterService {

    Flux<TierScooters> findAll();

    List<TierScooters> findAmount(int amount);
}
