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
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Competition implements Serializable{

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private String region;
private Date founded;
private String trophyImg;	
private String website;
@ManyToOne
private Confederation confederation;
@OneToMany(mappedBy="competition")
private Collection<Tournement> tournements;

}
