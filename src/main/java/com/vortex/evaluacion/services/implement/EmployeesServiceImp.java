package com.vortex.evaluacion.services.implement;

import com.vortex.evaluacion.models.Employees;
import com.vortex.evaluacion.repositories.EmployeesRepository;
import com.vortex.evaluacion.services.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Set;

@Service
public class EmployeesServiceImp implements EmployeesService {

    @Autowired
    public EmployeesRepository employeesRepository;


    @Override
    public Employees save(Employees employee) {
        return employeesRepository.save(employee);
    }

    @Override
    public Employees update(long EMPLOYEE_ID, String FIRST_NAME, String LAST_NAME, String EMAIL, String PHONE_NUMBER, LocalDate HIRE_DATE, double SALARY, double COMMISSION_PCT) {
        Employees employee = employeesRepository.findById(EMPLOYEE_ID).orElse(null);
        employee.setFIRST_NAME(FIRST_NAME);
        employee.setLAST_NAME(LAST_NAME);
        employee.setEMAIL(EMAIL);
        employee.setPHONE_NUMBER(PHONE_NUMBER);
        employee.setHIRE_DATE(HIRE_DATE);
        employee.setSALARY(SALARY);
        employee.setCOMMISSION_PCT(COMMISSION_PCT);

        employeesRepository.save(employee);
        return employee;
    }

    @Override
    public void delete(long EMPLOYEE_ID) {
        employeesRepository.findById(EMPLOYEE_ID).ifPresent(employee -> employeesRepository.delete(employee));
    }


    @Override
    public Employees findById(long EMPLOYEE_ID) {
        return employeesRepository.findById(EMPLOYEE_ID).orElse(null);
    }
}
