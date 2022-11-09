package com.vortex.evaluacion.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Locations {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int LOCATION_ID;
    private String STREET_ADDRESS, POSTAL_CODE, CITY, STATE_PROVINCE;

    public Locations(){}

    public Locations(int LOCATION_ID, String STREET_ADDRESS, String POSTAL_CODE, String CITY, String STATE_PROVINCE) {
        this.LOCATION_ID = LOCATION_ID;
        this.STREET_ADDRESS = STREET_ADDRESS;
        this.POSTAL_CODE = POSTAL_CODE;
        this.CITY = CITY;
        this.STATE_PROVINCE = STATE_PROVINCE;
    }

    public int getLOCATION_ID() {
        return LOCATION_ID;
    }

    public String getSTREET_ADDRESS() {
        return STREET_ADDRESS;
    }

    public void setSTREET_ADDRESS(String STREET_ADDRESS) {
        this.STREET_ADDRESS = STREET_ADDRESS;
    }

    public String getPOSTAL_CODE() {
        return POSTAL_CODE;
    }

    public void setPOSTAL_CODE(String POSTAL_CODE) {
        this.POSTAL_CODE = POSTAL_CODE;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public String getSTATE_PROVINCE() {
        return STATE_PROVINCE;
    }

    public void setSTATE_PROVINCE(String STATE_PROVINCE) {
        this.STATE_PROVINCE = STATE_PROVINCE;
    }
}
