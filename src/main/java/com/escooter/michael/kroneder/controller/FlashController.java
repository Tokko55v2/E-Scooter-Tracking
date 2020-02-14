package com.escooter.michael.kroneder.controller;

import com.escooter.michael.kroneder.entity.Flash;
import com.escooter.michael.kroneder.service.FlashService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/flash")
public class FlashController {

    private FlashService flashService;

    public FlashController(FlashService flashService){
        this.flashService = flashService;
    }

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Flux<Flash> getAll(){
        return flashService.findAll();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping(value = "/{id}")
    public Mono<Flash> getById(@PathVariable("id") String accountId){
        return flashService.getById(accountId);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public Flux<Flash> save(@RequestBody Flux<Flash> flash){
        return flashService.save(flash);
    }
}
