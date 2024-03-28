package com.mybinge.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @Data
    @Entity
    @Table(name = "movies_list")
    public class movies {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "movie_name", nullable = false)
        @Size(max = 100)
        private String movieName;

        @Column(nullable = false)
        @Size(max = 100)
        private String runtime;

        @Column(nullable = false)
        @Size(max = 100)
        private String year;

        @Column(nullable = false)
        @Size(max = 500)
        private String description;

        @Column(nullable = false)
        @Size(max = 100)
        private String ratings;

        @Column(nullable = false)
        @Size(max = 100)
        private String cast;

        @Column(nullable = false)
        @Size(max = 100)
        private String director;

        @Column(nullable = false)
        @Size(max = 100)
        private String genre;

        @Column(nullable = false)
        @Size(max = 500)
        private String posterlink;

        @Column(nullable = false)
        @Size(max = 100)
        private String category;
    }


