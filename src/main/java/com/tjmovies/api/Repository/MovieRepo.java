package com.tjmovies.api.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tjmovies.api.Entity.MovieEntity;

@Repository
public interface MovieRepo extends CrudRepository<MovieEntity,Integer>{

}
