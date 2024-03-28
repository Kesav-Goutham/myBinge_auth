package com.mybinge.controllers;

import com.mybinge.entities.movies;
import com.mybinge.repositories.MoviesRepository;
import com.mybinge.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class movieController {
    @Autowired
    private MoviesRepository moviesRepository;

    @GetMapping("/movies")
    public List<movies> getAllUsers() {
        return moviesRepository.findAll();
    }
}
