package com.yass.fooot.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class League implements Serializable{

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Date founded;
	private String description;
	private Integer numberOfTeams;
	private String logo;
	private String country;
	private String website;
	@OneToMany(mappedBy="league")
	private Collection<Club> clubs;
	@ManyToOne
	private LeaguePro league_pro; 
	
	@OneToMany(mappedBy="league")
	private Collection<LeagueSeason> leaguesSeasons;
	}
