package com.escooter.michael.kroneder.service;

import com.escooter.michael.kroneder.entity.Tier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class TierServiceImpl implements TierService {


    @Autowired
    private ReactiveMongoTemplate template;

    @Override
    public Flux<Tier> save(Flux<Tier> tiers) {
        return template.insertAll(tiers.collectList());
    }

    @Override
    public Mono<Tier> getById(String id) {
        return null;
    }

    @Override
    public Flux<Tier> findAll() {
        return template.findAll(Tier.class);
    }
}
