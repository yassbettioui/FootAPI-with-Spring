package com.yass.fooot.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Federation implements Serializable{

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private String country;
private String abreviation;
private Date founded;
private String president;
private String website;
private String logoPicture;	
@OneToMany(mappedBy="federation")
private Collection<NationalTeam> national_teams;
@OneToMany(mappedBy="federation")
private Collection<Tournement> tournements;
}
