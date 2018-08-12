package com.hoorah.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hoorah.rest.entity.Beer;

@RepositoryRestResource
public interface BeerRepository extends JpaRepository<Beer, Long> {

}
