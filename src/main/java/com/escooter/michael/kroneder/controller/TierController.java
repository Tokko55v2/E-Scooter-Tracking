package com.escooter.michael.kroneder.controller;

import com.escooter.michael.kroneder.entity.Tier;
import com.escooter.michael.kroneder.service.TierService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/tier")
public class TierController {

    private TierService service;

    public TierController(TierService service){
        this.service = service;
    }

    @GetMapping
    public List<Tier> getAll(){
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public Mono<Tier> getById(@PathVariable("id") String tierId){
        return service.getById(tierId);
    }

    @PostMapping
    public Flux<Tier> save(@RequestBody Flux<Tier> tier){
        return service.save(tier);
    }
}
