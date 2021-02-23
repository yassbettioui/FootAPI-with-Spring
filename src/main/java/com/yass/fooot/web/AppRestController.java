package com.yass.fooot.web;

import com.yass.fooot.dao.ClubRepository;
import com.yass.fooot.dao.PlayerRepository;
import com.yass.fooot.dao.StadiumRepository;
import com.yass.fooot.entities.Club;
import com.yass.fooot.entities.Player;
import com.yass.fooot.entities.Stadium;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
@CrossOrigin("*")
@RestController
public class AppRestController {  
 
    @Autowired
	private PlayerRepository playerRepository;
    @Autowired
   	private ClubRepository clubRepository;
    @Autowired
   	private StadiumRepository stadiumRepository;
   @GetMapping(path="/photoPlayer/{id}",produces = MediaType.IMAGE_JPEG_VALUE)
   public byte[] getPhotoPlayer(@PathVariable("id") Long id) throws Exception{
       Player p= playerRepository.findById(id).get();
       
       return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/fooot/players/"+p.getPhoto()));
} 
   @PostMapping(path = "uploadPlayerPhoto/{id}")
   public void uploadPhoto(MultipartFile file,@PathVariable Long id) throws Exception{
   	   Player p= playerRepository.findById(id).get();
   p.setPhoto(id+".jpg");
   Files.write(Paths.get(System.getProperty("user.home")+"/fooot/players/"+p.getPhoto()),file.getBytes());
   playerRepository.save(p);
       }
   @GetMapping(path="/photoClub/{id}",produces = MediaType.IMAGE_PNG_VALUE)
   public byte[] getPhotoClub(@PathVariable("id") Long id) throws Exception{
       Club c= clubRepository.getOne(id);
       
       return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/fooot/clubs/"+c.getLogo()));
}
   
   @GetMapping(path="/photoStadium/{id}",produces = MediaType.IMAGE_JPEG_VALUE)
   public byte[] getPhotoStadium(@PathVariable("id") Long id) throws Exception{
       Stadium s= stadiumRepository.getOne(id);
       
       return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/fooot/stadiums/"+s.getPicture()));

}
}

