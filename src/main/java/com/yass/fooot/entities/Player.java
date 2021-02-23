package com.yass.fooot.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @NoArgsConstructor  @AllArgsConstructor
@Entity
public class Player implements Serializable {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String fullName;
	private Date birthday;
	private String placeOfBirth;
	private Integer height;
	private boolean isActuallyInternational;
	private boolean isInjured;
	private boolean isCapitain;
	private String position;
	private Integer caps;
	private Integer goals;
	private String firstNationality;
	private String secondNationality;
	private String photo;
    @ManyToOne
	private Club Club;
    @ManyToOne
   	private NationalTeam nationalTeam;
}
	
