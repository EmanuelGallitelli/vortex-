package com.vortex.evaluacion.dto;

import com.vortex.evaluacion.models.Departaments;

public class DepartamentsDTO {
    private int DEPARTMENT_ID, MANAGER_ID, LOCATION_ID ;
    private String DEPARTMENT_NAME;

    public DepartamentsDTO(){}

    public DepartamentsDTO(Departaments departaments){
        this.DEPARTMENT_ID = departaments.getDEPARTMENT_ID();
        this.MANAGER_ID = departaments.getMANAGER_ID();
        this.LOCATION_ID = departaments.getLOCATION_ID();
        this.DEPARTMENT_NAME = departaments.getDEPARTMENT_NAME();
    }

    public int getDEPARTMENT_ID() {
        return DEPARTMENT_ID;
    }

    public int getMANAGER_ID() {
        return MANAGER_ID;
    }

    public int getLOCATION_ID() {
        return LOCATION_ID;
    }

    public String getDEPARTMENT_NAME() {
        return DEPARTMENT_NAME;
    }
}
