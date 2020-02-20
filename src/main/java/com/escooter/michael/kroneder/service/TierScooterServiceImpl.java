package com.escooter.michael.kroneder.service;

import com.escooter.michael.kroneder.entity.TierScooters;
import com.escooter.michael.kroneder.repository.TierScootersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

@Service
public class TierScooterServiceImpl implements TierScooterService {

    @Autowired
    TierScootersRepository tierScootersRepository;

    public TierScooterServiceImpl(TierScootersRepository tierScootersRepository){
        this.tierScootersRepository = tierScootersRepository;
    }

    @Override
    public Flux<TierScooters> findAll() {
        return tierScootersRepository.findAll();
    }

    @Override
    public List<TierScooters> findAmount(int amount) {
        return getAmount(amount,tierScootersRepository.findAll().collectList().block());
    }

    private List<TierScooters> getAmount(int amount,List<TierScooters> tierList){
        List<TierScooters> subList = new ArrayList<>(tierList.subList(0,amount));
        return subList;
    }
}
