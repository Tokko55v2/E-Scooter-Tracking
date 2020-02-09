package com.escooter.michael.kroneder.service;

import com.escooter.michael.kroneder.entity.Flash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class FlashServiceImpl implements FlashService {



    @Autowired
    private ReactiveMongoTemplate template;

    @Override
    public Flux<Flash> saveOrUpdate(Flux<Flash> flash) {
        return template.insertAll(flash.collectList());
    }


    @Override
    public Mono<Flash> getById(String id) {
        return template.findById(id,Flash.class);
    }

    @Override
    public Flux<Flash> findAll() {
        return template.findAll(Flash.class);
    }
}
