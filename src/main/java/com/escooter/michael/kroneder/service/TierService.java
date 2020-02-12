package com.escooter.michael.kroneder.service;

import com.escooter.michael.kroneder.entity.Tier;
import reactor.core.publisher.Flux;

import java.util.List;

public interface TierService {

    Flux<Tier> save(Flux<Tier> tiers);

    Flux<Tier> getById(String licencePlate);

    List<Tier> getAmountOfX(String amount);

    List<Tier> findAll();
}
