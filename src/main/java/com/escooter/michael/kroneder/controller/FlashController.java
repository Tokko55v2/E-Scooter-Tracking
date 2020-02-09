package com.escooter.michael.kroneder.controller;

import com.escooter.michael.kroneder.entity.Flash;
import com.escooter.michael.kroneder.service.FlashService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.logging.Logger;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/flash")
public class FlashController {

    private FlashService flashService;

    public FlashController(FlashService flashService){
        this.flashService = flashService;
    }

    @GetMapping
    public Flux<Flash> getAll(){
        return flashService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Mono<Flash> getById(@PathVariable("id") String accountId){
        System.out.println(accountId);
        Logger.getLogger(accountId);
        return flashService.getById(accountId);
    }

    @PostMapping
    public Flux<Flash> saveOrUpdate(@RequestBody Flux<Flash> flash){
        return flashService.saveOrUpdate(flash);
    }




}
