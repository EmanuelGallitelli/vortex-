package com.vortex.evaluacion.repositories;

import com.vortex.evaluacion.models.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmployeesRepository extends JpaRepository<Employees, Long> { };
