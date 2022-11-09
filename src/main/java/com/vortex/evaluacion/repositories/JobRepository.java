package com.vortex.evaluacion.repositories;

import com.vortex.evaluacion.models.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface JobRepository extends JpaRepository<Jobs, Long> { }
