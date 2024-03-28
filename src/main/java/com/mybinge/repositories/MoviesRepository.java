package com.mybinge.repositories;

import com.mybinge.entities.movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<movies, Long> {

}
