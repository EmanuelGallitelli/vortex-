package com.vortex.evaluacion.dto;

import com.vortex.evaluacion.models.Employees;

import java.time.LocalDate;

public class EmployeesDTO {
    private int EMPLOYEE_ID;
    private String FIRST_NAME, EMAIL, PHONE_NUMBER;
    private String LAST_NAME;
    private LocalDate HIRE_DATE;
    private double SALARY, COMMISSION_PCT;

    public EmployeesDTO(){}

    public EmployeesDTO(Employees employees){
        this.EMPLOYEE_ID = employees.getEMPLOYEE_ID();
        this.FIRST_NAME = employees.getFIRST_NAME();
        this.LAST_NAME = employees.getLAST_NAME();
        this.EMAIL = employees.getEMAIL();
        this.PHONE_NUMBER = employees.getPHONE_NUMBER();
        this.HIRE_DATE = employees.getHIRE_DATE();
        this.SALARY = employees.getSALARY();
        this.COMMISSION_PCT = employees.getCOMMISSION_PCT();
    }

    public int getEMPLOYEE_ID() {
        return EMPLOYEE_ID;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public String getPHONE_NUMBER() {
        return PHONE_NUMBER;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public LocalDate getHIRE_DATE() {
        return HIRE_DATE;
    }

    public double getSALARY() {
        return SALARY;
    }

    public double getCOMMISSION_PCT() {
        return COMMISSION_PCT;
    }
}
