package com.vortex.evaluacion.repositories;

import com.vortex.evaluacion.models.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface CountriesRepository extends JpaRepository<Countries, Long> { }
