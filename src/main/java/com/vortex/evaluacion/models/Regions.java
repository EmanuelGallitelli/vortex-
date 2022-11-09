package com.vortex.evaluacion.models;

import javax.persistence.*;

@Entity
public class Regions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int REGION_ID;
    private String REGION_NAME;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="country_id")
    private Countries countries;

    public Regions(int REGION_ID, String REGION_NAME) {
        this.REGION_ID = REGION_ID;
        this.REGION_NAME = REGION_NAME;
    }

    public int getREGION_ID() {
        return REGION_ID;
    }

    public String getREGION_NAME() {
        return REGION_NAME;
    }

    public void setREGION_NAME(String REGION_NAME) {
        this.REGION_NAME = REGION_NAME;
    }
}
