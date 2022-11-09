package com.vortex.evaluacion.dto;

import com.vortex.evaluacion.models.Regions;

public class RegionsDTO {

    private int REGION_ID;
    private String REGION_NAME;

    public RegionsDTO(){}

    public RegionsDTO(Regions regions){
        this.REGION_ID = regions.getREGION_ID();
        this.REGION_NAME = regions.getREGION_NAME();
    }

    public int getREGION_ID() {
        return REGION_ID;
    }

    public String getREGION_NAME() {
        return REGION_NAME;
    }
}
