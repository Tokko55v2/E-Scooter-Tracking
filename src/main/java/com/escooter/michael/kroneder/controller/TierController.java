package com.escooter.michael.kroneder.controller;

import com.escooter.michael.kroneder.entity.Tier;
import com.escooter.michael.kroneder.service.TierService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/tier")
public class TierController {

    private TierService service;

    public TierController(TierService service){
        this.service = service;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping(value = "scooters")
    public List<Tier> getAll(){
        return service.findAll();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping(value = "/{amount}")
    public List<Tier> getFirstX(@PathVariable("amount") String amount){
        return service.getAmountOfX(amount);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping(value = "scooters/{licencePlate}")
    public Flux<Tier> getById(@PathVariable("licencePlate") String licencePlate){
        return service.getById(licencePlate);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public Flux<Tier> save(@RequestBody Flux<Tier> tier){
        return service.save(tier);
    }
}
