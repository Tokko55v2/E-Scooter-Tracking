package com.escooter.michael.kroneder.controller;

import com.escooter.michael.kroneder.entity.Tier;
import com.escooter.michael.kroneder.entity.TierScooters;
import com.escooter.michael.kroneder.service.TierScooterService;
import com.escooter.michael.kroneder.service.TierService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/tier")
public class TierController {

    private TierService service;

    private TierScooterService tierScooterService;

    public TierController(TierService service, TierScooterService tierScooterService){
        this.service = service;
        this.tierScooterService = tierScooterService;
    }

    @GetMapping(value = "scooters")
    public Flux<TierScooters> getAll(){
        return tierScooterService.findAll();
    }

    @GetMapping(value = "/{amount}")
    public List<TierScooters> getFirstX(@PathVariable("amount") String amount){
        return tierScooterService.findAmount(Integer.parseInt(amount));
    }

    @GetMapping(value = "scooters/{licencePlate}")
    public Flux<Tier> getById(@PathVariable("licencePlate") String licencePlate){
        return service.getById(licencePlate);
    }

    @PostMapping
    public Flux<Tier> save(@RequestBody Flux<Tier> tier){
        return service.save(tier);
    }
}
