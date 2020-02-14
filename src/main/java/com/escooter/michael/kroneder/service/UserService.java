package com.escooter.michael.kroneder.service;

import com.escooter.michael.kroneder.entity.User;
import reactor.core.publisher.Mono;

public interface UserService {

    Mono<User> findByUsername(String username);
}
