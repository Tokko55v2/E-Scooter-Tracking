package com.escooter.michael.kroneder.repository;
import com.escooter.michael.kroneder.entity.Tier;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface TierRepository extends ReactiveMongoRepository<Tier,String> {

    Flux<Tier> findAllByLicencePlate(String licencePlate);
}
