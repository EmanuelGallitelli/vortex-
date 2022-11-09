package com.vortex.evaluacion.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Departaments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private int DEPARTMENT_ID;
    private int MANAGER_ID, LOCATION_ID ;
    private String DEPARTMENT_NAME;

    public Departaments(){}

    public Departaments(int DEPARTMENT_ID, int MANAGER_ID, int LOCATION_ID, String DEPARTMENT_NAME) {
        this.DEPARTMENT_ID = DEPARTMENT_ID;
        this.MANAGER_ID = MANAGER_ID;
        this.LOCATION_ID = LOCATION_ID;
        this.DEPARTMENT_NAME = DEPARTMENT_NAME;
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

    public void setDEPARTMENT_NAME(String DEPARTMENT_NAME) {
        this.DEPARTMENT_NAME = DEPARTMENT_NAME;
    }
}
