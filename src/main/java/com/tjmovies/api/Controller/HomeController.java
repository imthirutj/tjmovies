package com.tjmovies.api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.tjmovies.api.Entity.MovieEntity;
import com.tjmovies.api.Services.MovieService;

import java.util.*;

import javax.websocket.server.PathParam;

@RestController
public class HomeController {
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/home")
	public String Home() {
		return "Welcome to home";
	}
	
	@GetMapping("/get")
	public List<MovieEntity> getMovie(){
		
		return movieService.getMovie();
		
	}
	
	@GetMapping("/getBy")
	public Optional<MovieEntity> getId(@RequestParam Integer Id){
		
		return movieService.getId(Id);
		
	}
	
	@PostMapping("/create")
	public MovieEntity createMv(@RequestBody MovieEntity movieEntity) {
		return movieService.createMv(movieEntity);
	}
	
	
	
	
	

	//thymeleaf
	/*
	 * @RequestMapping("/mvUI") public ModelAndView welcome() { ModelAndView
	 * modelAndView = new ModelAndView(); modelAndView.setViewName("index"); return
	 * modelAndView; }
	 * 
	 * @PostMapping("/mvForm") public String greetingSubmit(@ModelAttribute
	 * MovieEntity mvEntity, Model model) { model.addAttribute("mvEntity",mvEntity);
	 * return "result"; }
	 */
	

}
