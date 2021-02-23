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
public class Club implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private String fullName;
private String nickName;
private Date founded;
private String coach;
private String chairman;
private String ground;
private Long capacity;
private String website;
private String logo;
private String country;
@OneToMany(mappedBy="Club")
private Collection<Player> players;
@ManyToOne
private League league;

@ManyToOne
private Stadium stadium;
}


