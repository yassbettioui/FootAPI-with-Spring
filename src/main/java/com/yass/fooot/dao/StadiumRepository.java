package com.yass.fooot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.yass.fooot.entities.Stadium;
@CrossOrigin("*")
@RepositoryRestResource
public interface StadiumRepository extends JpaRepository<Stadium, Long> {

}
