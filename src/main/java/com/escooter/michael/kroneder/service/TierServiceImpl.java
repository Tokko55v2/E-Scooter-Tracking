package com.escooter.michael.kroneder.service;

import com.escooter.michael.kroneder.entity.Tier;
import com.escooter.michael.kroneder.repository.TierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;


import java.util.ArrayList;
import java.util.List;

@Service
public class TierServiceImpl implements TierService {

    @Autowired
    private TierRepository tierRepository;

    public TierServiceImpl(TierRepository tierRepository){
        this.tierRepository = tierRepository;
    }


    @CreatedDate
    @Override
    public Flux<Tier> save(Flux<Tier> tiers) {
        return tierRepository.saveAll(tiers);
    }

    @Override
    public Flux<Tier> getById(String licencePlate) {
        return tierRepository.findAllByLicencePlate(licencePlate);
    }

    @Override
    public List<Tier> getAmountOfX(String amount) {
        List<Tier> tierList = tierRepository.findAll().collectList().block();
        return getAmount(Integer.parseInt(amount),tierList);
    }

    @Override
    public List<Tier> findAll() {
        List<Tier> tierList = tierRepository.findAll().collectList().block();
        List<Tier> allTiersList = new ArrayList<>();
        boolean isInList = false;
        for (Tier t: tierList) {
            for (Tier j: allTiersList) {
                if(t.getId() != null || j.getId() != null){
                    if((j.getId().equals(t.getId()))){
                        isInList = true;
                    }
                }
            }
            if(!isInList){
                allTiersList.add(t);
            }
            isInList = false;
        }
        return allTiersList;
    }

    private List<Tier> getAmount(int amount,List<Tier> tierList){
        List<Tier> subList = new ArrayList<>(tierList.subList(0,amount));
        return subList;
    }
}
