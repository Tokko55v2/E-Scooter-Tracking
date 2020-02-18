package com.escooter.michael.kroneder.entity;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Tier {

    @Id
    String idDB;
    String id;
    String state;
    String lastLocationUpdate;
    String lastStateChange;
    Integer batteryLevel;
    Float lat;
    Float lng;
    Integer maxSpeed;
    String zoneId;
    String licencePlate;
    String vin;
    Integer code;
    Boolean isRentable;
    String iotVendor;
    String timeStamp;

    public Tier(String id, String state, String lastLocationUpdate, String lastStateChange, Integer batteryLevel,
                Float lat, Float lng, Integer maxSpeed, String zoneId, String licencePlate, String vin,
                Integer code, Boolean isRentable, String iotVendor, String timeStamp) {
        this.id = id;
        this.state = state;
        this.lastLocationUpdate = lastLocationUpdate;
        this.lastStateChange = lastStateChange;
        this.batteryLevel = batteryLevel;
        this.lat = lat;
        this.lng = lng;
        this.maxSpeed = maxSpeed;
        this.zoneId = zoneId;
        this.licencePlate = licencePlate;
        this.vin = vin;
        this.code = code;
        this.isRentable = isRentable;
        this.iotVendor = iotVendor;
        this.timeStamp = timeStamp;
    }

    public Tier(){

    }

    public String getIdDB() {
        return idDB;
    }

    public void setIdDB(String idDB) {
        this.idDB = idDB;
    }

    @JsonGetter("timeStamp")
    public String getTimeStamp() {
        return timeStamp;
    }

    @JsonSetter("timeStamp")
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    @JsonGetter("id")
    public String getId() {
        return id;
    }

    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonGetter("state")
    public String getState() {
        return state;
    }

    @JsonSetter("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonGetter("lastLocationUpdate")
    public String getLastLocationUpdate() {
        return lastLocationUpdate;
    }

    @JsonSetter("lastLocationUpdate")
    public void setLastLocationUpdate(String lastLocationUpdate) {
        this.lastLocationUpdate = lastLocationUpdate;
    }

    @JsonGetter("lastStateChange")
    public String getLastStateChange() {
        return lastStateChange;
    }

    @JsonSetter("lastStateChange")
    public void setLastStateChange(String lastStateChange) {
        this.lastStateChange = lastStateChange;
    }

    @JsonGetter("batteryLevel")
    public Integer getBatteryLevel() {
        return batteryLevel;
    }

    @JsonSetter("batteryLevel")
    public void setBatteryLevel(Integer batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @JsonGetter("lat")
    public Float getLat() {
        return lat;
    }

    @JsonSetter("lat")
    public void setLat(Float lat) {
        this.lat = lat;
    }

    @JsonGetter("lng")
    public Float getLng() {
        return lng;
    }

    @JsonSetter("lng")
    public void setLng(Float lng) {
        this.lng = lng;
    }

    @JsonGetter("maxSpeed")
    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    @JsonSetter("maxSpeed")
    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @JsonGetter("zoneId")
    public String getZoneId() {
        return zoneId;
    }

    @JsonSetter("zoneId")
    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    @JsonGetter("licencePlate")
    public String getLicencePlate() {
        return licencePlate;
    }

    @JsonSetter("licencePlate")
    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    @JsonGetter("vin")
    public String getVin() {
        return vin;
    }

    @JsonSetter("vin")
    public void setVin(String vin) {
        this.vin = vin;
    }

    @JsonGetter("code")
    public Integer getCode() {
        return code;
    }

    @JsonSetter("code")
    public void setCode(Integer code) {
        this.code = code;
    }

    @JsonGetter("isRentable")
    public Boolean getRentable() {
        return isRentable;
    }

    @JsonSetter("isRentable")
    public void setRentable(Boolean rentable) {
        isRentable = rentable;
    }

    @JsonGetter("iotVendor")
    public String getIotVendor() {
        return iotVendor;
    }

    @JsonSetter("iotVendor")
    public void setIotVendor(String iotVendor) {
        this.iotVendor = iotVendor;
    }
}
