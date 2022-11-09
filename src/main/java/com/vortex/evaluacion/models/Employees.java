package com.vortex.evaluacion.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private int EMPLOYEE_ID;
    private String FIRST_NAME, EMAIL, PHONE_NUMBER;
    @Column(nullable = true)
    private String LAST_NAME;
    private LocalDate HIRE_DATE;
    private double SALARY, COMMISSION_PCT;

    public Employees(){}

    public Employees(String FIRST_NAME, String LAST_NAME, String EMAIL, String PHONE_NUMBER, LocalDate HIRE_DATE, double SALARY, double COMMISSION_PCT) {
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.EMAIL = EMAIL;
        this.PHONE_NUMBER = PHONE_NUMBER;
        this.HIRE_DATE = HIRE_DATE;
        this.SALARY = SALARY;
        this.COMMISSION_PCT = COMMISSION_PCT;
    }

    public int getEMPLOYEE_ID() {
        return EMPLOYEE_ID;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getPHONE_NUMBER() {
        return PHONE_NUMBER;
    }

    public void setPHONE_NUMBER(String PHONE_NUMBER) {
        this.PHONE_NUMBER = PHONE_NUMBER;
    }

    public LocalDate getHIRE_DATE() {
        return HIRE_DATE;
    }

    public void setHIRE_DATE(LocalDate HIRE_DATE) {
        this.HIRE_DATE = HIRE_DATE;
    }

    public double getCOMMISSION_PCT() {
        return COMMISSION_PCT;
    }

    public void setCOMMISSION_PCT(double COMMISSION_PCT) {
        this.COMMISSION_PCT = COMMISSION_PCT;
    }

    public double getSALARY() {
        return SALARY;
    }

    public void setSALARY(double SALARY) {
        this.SALARY = SALARY;
    }
}
