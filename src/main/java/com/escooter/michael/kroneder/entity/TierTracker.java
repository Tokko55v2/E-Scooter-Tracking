package com.escooter.michael.kroneder.entity;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class TierTracker {

    @Id
    private String id;
    private Integer scooterCount;
    private String timestampCodec;

    public TierTracker(String id, Integer scooterCount, String timestampCodec) {
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

    @JsonGetter("scooterCounter")
    public Integer getScooterCount() {
        return scooterCount;
    }

    @JsonSetter("scooterCounter")
    public void setScooterCount(Integer scooterCount) {
        this.scooterCount = scooterCount;
    }

    @JsonGetter("timestamp")
    public String getTimestampCodec() {
        return timestampCodec;
    }

    @JsonSetter("timestamp")
    public void setTimestampCodec(String timestampCodec) {
        this.timestampCodec = timestampCodec;
    }
}
