package com.escooter.michael.kroneder.repository;

import com.escooter.michael.kroneder.entity.Tier;
import com.escooter.michael.kroneder.entity.TierScooters;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface TierScootersRepository extends ReactiveMongoRepository<TierScooters,String> {

    Flux<Tier> findAllByLicencePlate(String licencePlate);

}
