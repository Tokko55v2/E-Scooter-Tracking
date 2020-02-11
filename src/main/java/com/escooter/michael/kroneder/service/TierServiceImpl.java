package com.escooter.michael.kroneder.service;

import com.escooter.michael.kroneder.entity.Tier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Service
public class TierServiceImpl implements TierService {


    @Autowired
    private ReactiveMongoTemplate template;

    @CreatedDate
    @Override
    public Flux<Tier> save(Flux<Tier> tiers) {
        return template.insertAll(tiers.collectList());
    }

    @Override
    public Mono<Tier> getById(String id) {
        return null;
    }

    @Override
    public List<Tier> findAll() {
        List<Tier> tierList = template.findAll(Tier.class).collectList().block();
        List<Tier> allTiersList = new ArrayList<>();
        boolean isInList = false;
        for (Tier t: tierList) {
            for (Tier j: allTiersList) {
                if((j.getId().equals(t.getId()))){
                    isInList = true;
                }
            }
            if(!isInList)
                allTiersList.add(t);
            isInList = false;
        }
        return allTiersList;
    }
}
