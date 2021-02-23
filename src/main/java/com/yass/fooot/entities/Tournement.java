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
public class Tournement implements Serializable{

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private String logo;
@ManyToOne
private Season season;

@ManyToOne
private Competition competition;

@ManyToOne
private Federation federation;

@OneToMany(mappedBy="tournement")
private Collection<TournementStaduim> tournementStaduim;



}
