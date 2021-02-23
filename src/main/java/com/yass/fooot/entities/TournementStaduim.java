package com.yass.fooot.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class TournementStaduim implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id; 
	@ManyToOne
	private Stadium stadium;
	@ManyToOne
	private Tournement tournement;
	
}
