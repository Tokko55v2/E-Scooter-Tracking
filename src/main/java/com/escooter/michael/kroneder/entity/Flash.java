package com.escooter.michael.kroneder.entity;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "flash")
public class Flash {

    @Id
    private String id;
    private Integer idScooter;
    private String idCity;
    private String ScooterCode;
    private String idScooterState;
    private Double Distance;
    private String powerPercent;
    private String RemainderRange;
    private String ScooterModel;
    private Boolean IsBookable;
    private Boolean IsToolable;
    private String StreetInfo;
    private String StreetInfo2;
    private String txtRentalPrice;
    private Boolean Locked;
    private LocationFlash location;
    private String GoogleMapsMode;
    private Integer GoogleMapsEstimatedTimeRatio;
    private Boolean CostEstimationEnabled;
    private String CityName;
    private Integer GSMCoverage;
    private Integer SatelliteNumber;
    private String GPSStatus_txt;
    private String GPSStatus_sort;

    public Flash() { }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonGetter("idScooter")
    public Integer getIdScooter() {
        return idScooter;
    }

    @JsonSetter("idScooter")
    public void setIdScooter(Integer idScooter) {
        this.idScooter = idScooter;
    }

    @JsonGetter("idCity")
    public String getIdCity() {
        return idCity;
    }

    @JsonSetter("idCity")
    public void setIdCity(String idCity) {
        this.idCity = idCity;
    }

    @JsonGetter("ScooterCode")
    public String getScooterCode() {
        return ScooterCode;
    }

    @JsonSetter("ScooterCode")
    public void setScooterCode(String scooterCode) {
        ScooterCode = scooterCode;
    }

    @JsonGetter("idScooterState")
    public String getIdScooterState() {
        return idScooterState;
    }

    @JsonSetter("idScooterState")
    public void setIdScooterState(String idScooterState) {
        this.idScooterState = idScooterState;
    }

    @JsonGetter("Distance")
    public Double getDistance() {
        return Distance;
    }

    @JsonSetter("Distance")
    public void setDistance(Double distance) {
        Distance = distance;
    }

    @JsonGetter("PowerPercent")
    public String getPowerPercent() {
        return powerPercent;
    }

    @JsonSetter("PowerPercentInt")
    public void setPowerPercent(String powerPercent) {
        this.powerPercent = powerPercent;
    }

    @JsonGetter("RemainderRange")
    public String getRemainderRange() {
        return RemainderRange;
    }

    @JsonSetter("RemainderRange")
    public void setRemainderRange(String remainderRange) {
        RemainderRange = remainderRange;
    }

    @JsonGetter("ScooterModel")
    public String getScooterModel() {
        return ScooterModel;
    }

    @JsonSetter("ScooterModel")
    public void setScooterModel(String scooterModel) {
        ScooterModel = scooterModel;
    }

    @JsonGetter("IsBookable")
    public Boolean getBookable() {
        return IsBookable;
    }

    @JsonSetter("IsBookable")
    public void setBookable(Boolean bookable) {
        IsBookable = bookable;
    }

    @JsonGetter("IsTootable")
    public Boolean getToolable() {
        return IsToolable;
    }

    @JsonSetter("IsTootable")
    public void setToolable(Boolean toolable) {
        IsToolable = toolable;
    }

    @JsonGetter("StreetInfo")
    public String getStreetInfo() {
        return StreetInfo;
    }

    @JsonSetter("StreetInfo")
    public void setStreetInfo(String streetInfo) {
        StreetInfo = streetInfo;
    }

    @JsonGetter("StreetInfo2")
    public String getStreetInfo2() {
        return StreetInfo2;
    }

    @JsonSetter("StreetInfo2")
    public void setStreetInfo2(String streetInfo2) {
        StreetInfo2 = streetInfo2;
    }

    @JsonGetter("txtRentalPrice")
    public String getTxtRentalPrice() {
        return txtRentalPrice;
    }

    @JsonSetter("txtRentalPrice")
    public void setTxtRentalPrice(String txtRentalPrice) {
        this.txtRentalPrice = txtRentalPrice;
    }

    @JsonGetter("Locked")
    public Boolean getLocked() {
        return Locked;
    }

    @JsonSetter("Locked")
    public void setLocked(Boolean locked) {
        Locked = locked;
    }

    @JsonGetter("location")
    public LocationFlash getLocation() {
        return location;
    }

    @JsonSetter("location")
    public void setLocation(LocationFlash location) {
        this.location = location;
    }

    @JsonGetter("GoogleMapsMode")
    public String getGoogleMapsMode() {
        return GoogleMapsMode;
    }

    @JsonSetter("GoogleMapsMode")
    public void setGoogleMapsMode(String googleMapsMode) {
        GoogleMapsMode = googleMapsMode;
    }

    @JsonGetter("GoogleMapsEstimatedTimeRatio")
    public Integer getGoogleMapsEstimatedTimeRatio() {
        return GoogleMapsEstimatedTimeRatio;
    }

    @JsonSetter("GoogleMapsEstimatedTimeRatio")
    public void setGoogleMapsEstimatedTimeRatio(Integer googleMapsEstimatedTimeRatio) {
        GoogleMapsEstimatedTimeRatio = googleMapsEstimatedTimeRatio;
    }

    @JsonGetter("CostEstimationEnabled")
    public Boolean getCostEstimationEnabled() {
        return CostEstimationEnabled;
    }

    @JsonSetter("CostEstimationEnabled")
    public void setCostEstimationEnabled(Boolean costEstimationEnabled) {
        CostEstimationEnabled = costEstimationEnabled;
    }

    @JsonGetter("CityName")
    public String getCityName() {
        return CityName;
    }

    @JsonSetter("CityName")
    public void setCityName(String cityName) {
        CityName = cityName;
    }

    @JsonGetter("GSMCoverage")
    public Integer getGSMCoverage() {
        return GSMCoverage;
    }

    @JsonSetter("GSMCoverage")
    public void setGSMCoverage(Integer GSMCoverage) {
        this.GSMCoverage = GSMCoverage;
    }

    @JsonGetter("SatelliteNumber")
    public Integer getSatelliteNumber() {
        return SatelliteNumber;
    }

    @JsonSetter("SatelliteNumber")
    public void setSatelliteNumber(Integer satelliteNumber) {
        SatelliteNumber = satelliteNumber;
    }

    @JsonGetter("GPSStatus_txt")
    public String getGPSStatus_txt() {
        return GPSStatus_txt;
    }

    @JsonSetter("GPSStatus_txt")
    public void setGPSStatus_txt(String GPSStatus_txt) {
        this.GPSStatus_txt = GPSStatus_txt;
    }

    @JsonGetter("GPSStatus_sort")
    public String getGPSStatus_sort() {
        return GPSStatus_sort;
    }

    @JsonSetter("GPSStatus_sort")
    public void setGPSStatus_sort(String GPSStatus_sort) {
        this.GPSStatus_sort = GPSStatus_sort;
    }
}

