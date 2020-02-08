package com.escooter.michael.kroneder.entity;

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
    private String PowerPercent;
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

    public Flash(Integer idScooter, String idCity, String scooterCode, String idScooterState, Double distance, String powerPercent, String remainderRange, String scooterModel, Boolean isBookable, Boolean isToolable, String streetInfo, String streetInfo2, String txtRentalPrice, Boolean locked, LocationFlash location, String googleMapsMode, Integer googleMapsEstimatedTimeRatio, Boolean costEstimationEnabled, String cityName, Integer GSMCoverage, Integer satelliteNumber, String GPSStatus_txt, String GPSStatus_sort) {
        this.idScooter = idScooter;
        this.idCity = idCity;
        ScooterCode = scooterCode;
        this.idScooterState = idScooterState;
        Distance = distance;
        PowerPercent = powerPercent;
        RemainderRange = remainderRange;
        ScooterModel = scooterModel;
        IsBookable = isBookable;
        IsToolable = isToolable;
        StreetInfo = streetInfo;
        StreetInfo2 = streetInfo2;
        this.txtRentalPrice = txtRentalPrice;
        Locked = locked;
        this.location = location;
        GoogleMapsMode = googleMapsMode;
        GoogleMapsEstimatedTimeRatio = googleMapsEstimatedTimeRatio;
        CostEstimationEnabled = costEstimationEnabled;
        CityName = cityName;
        this.GSMCoverage = GSMCoverage;
        SatelliteNumber = satelliteNumber;
        this.GPSStatus_txt = GPSStatus_txt;
        this.GPSStatus_sort = GPSStatus_sort;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getIdScooter() {
        return idScooter;
    }

    public void setIdScooter(Integer idScooter) {
        this.idScooter = idScooter;
    }

    public String getIdCity() {
        return idCity;
    }

    public void setIdCity(String idCity) {
        this.idCity = idCity;
    }

    public String getScooterCode() {
        return ScooterCode;
    }

    public void setScooterCode(String scooterCode) {
        ScooterCode = scooterCode;
    }

    public String getIdScooterState() {
        return idScooterState;
    }

    public void setIdScooterState(String idScooterState) {
        this.idScooterState = idScooterState;
    }

    public Double getDistance() {
        return Distance;
    }

    public void setDistance(Double distance) {
        Distance = distance;
    }

    public String getPowerPercent() {
        return PowerPercent;
    }

    public void setPowerPercent(String powerPercent) {
        PowerPercent = powerPercent;
    }

    public String getRemainderRange() {
        return RemainderRange;
    }

    public void setRemainderRange(String remainderRange) {
        RemainderRange = remainderRange;
    }

    public String getScooterModel() {
        return ScooterModel;
    }

    public void setScooterModel(String scooterModel) {
        ScooterModel = scooterModel;
    }

    public Boolean getBookable() {
        return IsBookable;
    }

    public void setBookable(Boolean bookable) {
        IsBookable = bookable;
    }

    public Boolean getToolable() {
        return IsToolable;
    }

    public void setToolable(Boolean toolable) {
        IsToolable = toolable;
    }

    public String getStreetInfo() {
        return StreetInfo;
    }

    public void setStreetInfo(String streetInfo) {
        StreetInfo = streetInfo;
    }

    public String getStreetInfo2() {
        return StreetInfo2;
    }

    public void setStreetInfo2(String streetInfo2) {
        StreetInfo2 = streetInfo2;
    }

    public String getTxtRentalPrice() {
        return txtRentalPrice;
    }

    public void setTxtRentalPrice(String txtRentalPrice) {
        this.txtRentalPrice = txtRentalPrice;
    }

    public Boolean getLocked() {
        return Locked;
    }

    public void setLocked(Boolean locked) {
        Locked = locked;
    }

    public LocationFlash getLocation() {
        return location;
    }

    public void setLocation(LocationFlash location) {
        this.location = location;
    }

    public String getGoogleMapsMode() {
        return GoogleMapsMode;
    }

    public void setGoogleMapsMode(String googleMapsMode) {
        GoogleMapsMode = googleMapsMode;
    }

    public Integer getGoogleMapsEstimatedTimeRatio() {
        return GoogleMapsEstimatedTimeRatio;
    }

    public void setGoogleMapsEstimatedTimeRatio(Integer googleMapsEstimatedTimeRatio) {
        GoogleMapsEstimatedTimeRatio = googleMapsEstimatedTimeRatio;
    }

    public Boolean getCostEstimationEnabled() {
        return CostEstimationEnabled;
    }

    public void setCostEstimationEnabled(Boolean costEstimationEnabled) {
        CostEstimationEnabled = costEstimationEnabled;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public Integer getGSMCoverage() {
        return GSMCoverage;
    }

    public void setGSMCoverage(Integer GSMCoverage) {
        this.GSMCoverage = GSMCoverage;
    }

    public Integer getSatelliteNumber() {
        return SatelliteNumber;
    }

    public void setSatelliteNumber(Integer satelliteNumber) {
        SatelliteNumber = satelliteNumber;
    }

    public String getGPSStatus_txt() {
        return GPSStatus_txt;
    }

    public void setGPSStatus_txt(String GPSStatus_txt) {
        this.GPSStatus_txt = GPSStatus_txt;
    }

    public String getGPSStatus_sort() {
        return GPSStatus_sort;
    }

    public void setGPSStatus_sort(String GPSStatus_sort) {
        this.GPSStatus_sort = GPSStatus_sort;
    }
}

