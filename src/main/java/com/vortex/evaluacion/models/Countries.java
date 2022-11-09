package com.vortex.evaluacion.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Countries {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int COUNTRY_ID;

    private String COUNTRY_NAME;
    private int REGION_ID;

    @OneToMany(mappedBy = "countries", fetch = FetchType.EAGER)
    private Set<Regions> regions = new HashSet<>();

    public Countries(){}

    public Countries(String COUNTRY_NAME, int REGION_ID) {
        this.COUNTRY_NAME = COUNTRY_NAME;
        this.REGION_ID = REGION_ID;
    }

    public long getCOUNTRY_ID() {
        return COUNTRY_ID;
    }

    public String getCOUNTRY_NAME() {
        return COUNTRY_NAME;
    }

    public void setCOUNTRY_NAME(String COUNTRY_NAME) {
        this.COUNTRY_NAME = COUNTRY_NAME;
    }

    public long getREGION_ID() {
        return REGION_ID;
    }
}
