package com.yass.fooot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.yass.fooot.dao.ClubRepository;
import com.yass.fooot.dao.PlayerRepository;
import com.yass.fooot.entities.Club;
import com.yass.fooot.entities.League;
import com.yass.fooot.entities.Player;
import com.yass.fooot.entities.Stadium;


@SpringBootApplication
public class FoootApplication implements CommandLineRunner {

	@Autowired
	private PlayerRepository pr;
	public FoootApplication(PlayerRepository pr, ClubRepository cr,
			RepositoryRestConfiguration repositoryRestConfiguration) {
		super();
		this.pr = pr;
		this.cr = cr;
		this.repositoryRestConfiguration = repositoryRestConfiguration;
	}

	@Autowired
	private ClubRepository cr; 
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(FoootApplication.class, args);
	}

	public void run(String... args) throws Exception {
     repositoryRestConfiguration.exposeIdsFor(Player.class,Club.class,League.class,Stadium.class);
    
	}

}
