package com.escooter.michael.kroneder.service;

import com.escooter.michael.kroneder.entity.Flash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;



@Service
public class FlashServiceImpl implements FlashService {

    @Autowired
    private ReactiveMongoTemplate template;


    @CreatedDate
    @Override
    public Flux<Flash> save(Flux<Flash> flash) {
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
