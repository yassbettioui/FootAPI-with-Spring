package com.yass.fooot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.yass.fooot.entities.Tournement;
@CrossOrigin("*")
@RepositoryRestResource
public interface TournementRepository extends JpaRepository<Tournement, Long> {

}
