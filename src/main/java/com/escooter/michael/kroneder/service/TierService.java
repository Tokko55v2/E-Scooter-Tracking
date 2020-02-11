package com.escooter.michael.kroneder.service;

import com.escooter.michael.kroneder.entity.Tier;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface TierService {

    Flux<Tier> save(Flux<Tier> tiers);

    Mono<Tier> getById(String id);

    List<Tier> getAmountOfX(String amount);

    List<Tier> findAll();
}
