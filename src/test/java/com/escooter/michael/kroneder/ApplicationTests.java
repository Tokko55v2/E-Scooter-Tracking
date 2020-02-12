package com.escooter.michael.kroneder;

import com.escooter.michael.kroneder.entity.Tier;
import com.escooter.michael.kroneder.repository.TierRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ApplicationTests {

	@Autowired
	TierRepository tierRepository;

	@Test
	void Tier() {
		tierRepository.save(new Tier(null,"ACTIVE","2020-02-11T10:55:32Z","2020-02-04T22:06:22Z",30, (float)48.21943664550781,(float)16.40237808227539,20,"VIENNA","222364","AC222364",222364,true,"okai")).block();
		Flux<Tier> accountMono = tierRepository
				.findAllByLicencePlate("222364");

		StepVerifier
				.create(accountMono)
				.assertNext(tiers -> {
					assertEquals("222364", tiers.getLicencePlate());
					assertNotNull(tiers.getIdDB());
				})
				.expectComplete()
				.verify();
	}


}
