package com.vortex.evaluacion.dto;

import com.vortex.evaluacion.models.Countries;

public class CountriesDTO {

    private long COUNTRY_ID, REGION_ID;

    private String COUNTRY_NAME;

    public CountriesDTO(){}

    public CountriesDTO(Countries countries){
        this.COUNTRY_ID = countries.getCOUNTRY_ID();
        this.REGION_ID = countries.getREGION_ID();
        this.COUNTRY_NAME = countries.getCOUNTRY_NAME();
    }

    public long getCOUNTRY_ID() {
        return COUNTRY_ID;
    }

    public long getREGION_ID() {
        return REGION_ID;
    }

    public String getCOUNTRY_NAME() {
        return COUNTRY_NAME;
    }
}
