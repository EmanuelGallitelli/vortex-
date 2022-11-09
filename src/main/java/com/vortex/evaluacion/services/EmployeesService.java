package com.vortex.evaluacion.services;

import com.vortex.evaluacion.models.Employees;

import java.time.LocalDate;
import java.util.Set;


public interface EmployeesService {
    Employees save(Employees employee);
    Employees update(long EMPLOYEE_ID,String FIRST_NAME, String LAST_NAME, String EMAIL, String PHONE_NUMBER, LocalDate HIRE_DATE, double SALARY, double COMMISSION_PCT);
    void delete(long EMPLOYEE_ID);
    Employees findById(long EMPLOYEE_ID);
}