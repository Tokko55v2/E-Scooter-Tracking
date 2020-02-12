package com.escooter.michael.kroneder.controller;

import com.escooter.michael.kroneder.entity.TierTracker;
import com.escooter.michael.kroneder.service.TierLiveTrackerService;
import io.swagger.annotations.ResponseHeader;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("tier/track")
public class TierLiveTrackerController {

    private TierLiveTrackerService scooterLiveTracker;

    public TierLiveTrackerController(TierLiveTrackerService scooterLiveTracker){
        this.scooterLiveTracker = scooterLiveTracker;
    }
    @PostMapping()
    public void save(@RequestBody TierTracker trackerMono){
        scooterLiveTracker.save(trackerMono);
    }

    @GetMapping
    public Flux<TierTracker> findAll(){
        return scooterLiveTracker.getAll();
    }
}
