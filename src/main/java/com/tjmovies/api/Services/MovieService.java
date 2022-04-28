package com.tjmovies.api.Services;
import com.tjmovies.api.Entity.MovieEntity;
import com.tjmovies.api.Repository.MovieRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepo movieRepo;
	
	public List<MovieEntity> getMovie(){
		
		List<MovieEntity> movieList= new ArrayList<>();
		
		movieRepo.findAll().forEach(p->movieList.add(p));
		return movieList;
	}
	

	public MovieEntity createMv(MovieEntity movieEntity) {
		// TODO Auto-generated method stub
		return movieRepo.save(movieEntity);
	}


	public Optional<MovieEntity> getId(Integer mvId) {
		// TODO Auto-generated method stub
		return movieRepo.findById(mvId);
		
	}


}
