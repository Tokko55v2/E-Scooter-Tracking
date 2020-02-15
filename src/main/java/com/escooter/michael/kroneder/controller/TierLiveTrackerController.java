package com.escooter.michael.kroneder.controller;

import com.escooter.michael.kroneder.entity.TierTracker;
import com.escooter.michael.kroneder.service.TierLiveTrackerService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin
@RequestMapping("api/tier/track")
public class TierLiveTrackerController {

    private TierLiveTrackerService scooterLiveTracker;

    public TierLiveTrackerController(TierLiveTrackerService scooterLiveTracker){
        this.scooterLiveTracker = scooterLiveTracker;
    }

    @PostMapping()
    public Mono<TierTracker> save(@RequestBody TierTracker trackerMono){
       return scooterLiveTracker.save(trackerMono);
    }

    @GetMapping
    public Flux<TierTracker> findAll(){
        return scooterLiveTracker.getAll();
    }
}
