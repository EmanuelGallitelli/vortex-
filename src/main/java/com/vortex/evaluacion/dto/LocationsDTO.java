package com.vortex.evaluacion.dto;

import com.vortex.evaluacion.models.Locations;

public class LocationsDTO {

    private int LOCATION_ID;
    private String STREET_ADDRESS, POSTAL_CODE, CITY, STATE_PROVINCE;

    public LocationsDTO(){}

    public LocationsDTO(Locations locations){
        this.LOCATION_ID = locations.getLOCATION_ID();
        this.STREET_ADDRESS = locations.getSTREET_ADDRESS();
        this.POSTAL_CODE = locations.getPOSTAL_CODE();
        this.CITY = locations.getCITY();
        this.STATE_PROVINCE = locations.getSTATE_PROVINCE();
    }

    public int getLOCATION_ID() {
        return LOCATION_ID;
    }

    public String getSTREET_ADDRESS() {
        return STREET_ADDRESS;
    }

    public String getPOSTAL_CODE() {
        return POSTAL_CODE;
    }

    public String getCITY() {
        return CITY;
    }

    public String getSTATE_PROVINCE() {
        return STATE_PROVINCE;
    }
}
