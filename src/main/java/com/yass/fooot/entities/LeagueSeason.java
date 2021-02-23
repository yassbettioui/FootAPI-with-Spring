package com.yass.fooot.entities;

import java.io.Serializable;
import java.util.Collection;

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
public class LeagueSeason implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

	@ManyToOne
	private Season season;

	@ManyToOne
	private League league;


}

