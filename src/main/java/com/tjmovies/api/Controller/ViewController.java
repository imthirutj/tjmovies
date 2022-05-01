package com.tjmovies.api.Controller;

import java.util.List;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.common.base.Optional;
import com.tjmovies.api.Entity.MovieEntity;
import com.tjmovies.api.Repository.MovieRepo;
import com.tjmovies.api.Services.MovieService;

@Controller
public class ViewController {
	
	
	@Autowired
	private MovieRepo movieRepo;
	
	@Autowired
	private MovieService movieService;

	 @GetMapping("/magLinkForm")
	  
	  public String getform(@RequestParam(required = false) Integer Id,Model model) {
	  model.addAttribute("Form",new MovieEntity());
	  
	  
	  if(Id!=null) {
	  model.addAttribute("ID",Id);
	
	  
	  java.util.Optional<MovieEntity> list  =movieService.getId(Id);
	  
	  if(list.isPresent()) {
	  
	  model.addAttribute("mag_1", list.get().getMag_1());
	  //System.out.println(list.get().getMag_1());
	  
	  model.addAttribute("mag_2", list.get().getMag_2());
	 // System.out.println(list.get().getMag_2());
	  
	  model.addAttribute("mag_3", list.get().getMag_3());
	 // System.out.println(list.get().getMag_3());
	  
	  model.addAttribute("mag_4", list.get().getMag_4());
	//  System.out.println(list.get().getMag_4());
	  
	  model.addAttribute("mag_5", list.get().getMag_5());
	//  System.out.println(list.get().getMag_5());
	  }
	  else {System.out.println("no Present");}}
	  return "magLinkPage.html"; 
	  }
	 
	 @PostMapping("/magLinkForm")
	 public String submitForm(@ModelAttribute MovieEntity movieEntity, BindingResult result,Model model) {
		 movieRepo.save(movieEntity);
		 model.addAttribute("msg", "Updated Successfully");
		 model.addAttribute("ID", movieEntity.getId());
		 
		 model.addAttribute("mag_1", movieEntity.getMag_1());
		 model.addAttribute("mag_2", movieEntity.getMag_2());
		 model.addAttribute("mag_3", movieEntity.getMag_3());
		 model.addAttribute("mag_4", movieEntity.getMag_4());
		 model.addAttribute("mag_5", movieEntity.getMag_5());
		 
		 return "magLinkPage.html";
	 }
}
