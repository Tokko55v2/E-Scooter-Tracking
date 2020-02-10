package com.escooter.michael.kroneder.service;

import com.escooter.michael.kroneder.entity.Tier;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TierService {

    Flux<Tier> save(Flux<Tier> tiers);

    Mono<Tier> getById(String id);

    Flux<Tier> findAll();
}
