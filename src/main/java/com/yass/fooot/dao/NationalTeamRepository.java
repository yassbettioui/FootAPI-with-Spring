package com.yass.fooot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.yass.fooot.entities.NationalTeam;
@CrossOrigin("*")
@RepositoryRestResource
public interface NationalTeamRepository extends JpaRepository<NationalTeam, Long> {
@RestResource(path="/senior")
	public List<NationalTeam> findByIsSeniorIsTrue();

@RestResource(path="/U23")
public List<NationalTeam> findByIsU23IsTrue();

@RestResource(path="/U20")
public List<NationalTeam> findByIsU20IsTrue();

@RestResource(path="/U17")
public List<NationalTeam> findByIsU17IsTrue();

@RestResource(path="/Woman")
public List<NationalTeam> findByisWomenIsTrue();
}