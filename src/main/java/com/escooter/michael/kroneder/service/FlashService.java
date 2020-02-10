package com.escooter.michael.kroneder.service;

import com.escooter.michael.kroneder.entity.Flash;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface FlashService {

    Flux<Flash> save(Flux<Flash> account);

    Mono<Flash> getById(String id);

    Flux<Flash> findAll();
}
