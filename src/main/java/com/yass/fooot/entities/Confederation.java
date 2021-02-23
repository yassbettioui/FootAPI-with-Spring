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
public class Confederation implements Serializable{

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private String abreviation;
private String motto;
private Date founded;
private String foundedAt;
private String headquarters;
private String regionServed;
private Long membership;
private String website;
private String officialLanguges;
private String president;
private String secretaryGenaral;
private String LogoPicture;	
private String parentOrganization;
@OneToMany(mappedBy="confederation")
private Collection<Competition> competitions;
}
