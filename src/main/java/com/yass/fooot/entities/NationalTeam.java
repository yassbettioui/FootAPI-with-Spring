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
public class NationalTeam implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private String nickName;
private String headCoach;
private Date founded;
private String fifaCode;
private boolean isSenior;
private boolean isU23;
private boolean isU20;
private boolean isU17;
private boolean isWomen;
private String topScorer;
private Long fifaRank;
private Long mostCaps;
private String logo;
private String picture;
@ManyToOne
private Federation federation;

@OneToMany(mappedBy="nationalTeam")
private Collection<Player> players;



}
