package com.escooter.michael.kroneder.controller;

import com.escooter.michael.kroneder.entity.Tier;
import com.escooter.michael.kroneder.service.TierService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/tier")
public class TierController {

    private TierService service;

    public TierController(TierService service){
        this.service = service;
    }

    @GetMapping(value = "scooters")
    public List<Tier> getAll(){
        return service.findAll();
    }

    @GetMapping(value = "/{amount}")
    public List<Tier> getFirstX(@PathVariable("amount") String amount){
        return service.getAmountOfX(amount);
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
