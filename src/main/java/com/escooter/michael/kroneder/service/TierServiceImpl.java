package com.escooter.michael.kroneder.service;

import com.escooter.michael.kroneder.entity.Tier;
import com.escooter.michael.kroneder.entity.TierScooters;
import com.escooter.michael.kroneder.repository.TierRepository;
import com.escooter.michael.kroneder.repository.TierScootersRepository;
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

    @Autowired
    private TierScootersRepository tierScootersRepository;

    public TierServiceImpl(TierRepository tierRepository, TierScootersRepository tierScootersRepository){
        this.tierRepository = tierRepository;
        this.tierScootersRepository = tierScootersRepository;
    }


    @Override
    public Flux<Tier> save(Flux<Tier> tiers) {
        Flux<Tier> tierFlux = tierRepository.saveAll(tiers);
        saveNewScooterToScooterDB();
        return tierFlux;
    }

    @Override
    public Flux<Tier> getById(String licencePlate) {
        return tierRepository.findAllByLicencePlate(licencePlate);
    }

    public void saveNewScooterToScooterDB() {
        List<Tier> tierList = tierRepository.findAll().collectList().block();
        List<Tier> allTiersList = new ArrayList<>();
        boolean isInList = false;
        for (Tier t: tierList) {
            for (Tier j: allTiersList) {
                if(t.getId() != null && j.getId() != null){
                    if((j.getId().equals(t.getId()))){
                        isInList = true;
                    }
                }
            }
            if(!isInList){
                allTiersList.add(t);
                tierScootersRepository.save(new TierScooters(t.getId(),t.getState(),t.getLastLocationUpdate(),t.getLastStateChange(),
                        t.getBatteryLevel(),t.getLat(),t.getLng(),t.getMaxSpeed(),t.getZoneId(),t.getLicencePlate(),t.getVin(),
                        t.getCode(),t.getRentable(),t.getIotVendor(),t.getTimeStamp())).block();
            }
            isInList = false;
        }
    }


}
