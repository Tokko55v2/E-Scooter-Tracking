package com.escooter.michael.kroneder.service;

import com.escooter.michael.kroneder.entity.TierTracker;
import com.escooter.michael.kroneder.repository.TierLiveTrackerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

@Service
public class TierLiveTrackerServiceServiceImpl implements TierLiveTrackerService {

    @Autowired
    TierLiveTrackerRepository tierLiveTrackerRepository;

    @Override
    public Mono<TierTracker> save(TierTracker tierTrackerMono) {
        ZonedDateTime now = ZonedDateTime.now(ZoneOffset.UTC);
        tierTrackerMono.setTimestampCodec(now.toString());
        return tierLiveTrackerRepository.save(tierTrackerMono);
    }

    public Flux<TierTracker> getAll(){
        return tierLiveTrackerRepository.findAll();
    }
}
