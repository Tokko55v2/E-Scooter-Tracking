package com.escooter.michael.kroneder.entity;

import com.mongodb.BSONTimestampCodec;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import reactor.core.publisher.Mono;

import java.time.ZonedDateTime;

@Document
public class TierTracker {

    @Id
    private String id;
    private Mono<Integer> scooterCount;
    private ZonedDateTime timestampCodec;

    public TierTracker(String id, Mono<Integer> scooterCount, ZonedDateTime timestampCodec) {
        this.id = id;
        this.scooterCount = scooterCount;
        this.timestampCodec = timestampCodec;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Mono<Integer> getScooterCount() {
        return scooterCount;
    }

    public void setScooterCount(Mono<Integer> scooterCount) {
        this.scooterCount = scooterCount;
    }

    public ZonedDateTime getTimestampCodec() {
        return timestampCodec;
    }

    public void setTimestampCodec(ZonedDateTime timestampCodec) {
        this.timestampCodec = timestampCodec;
    }
}
