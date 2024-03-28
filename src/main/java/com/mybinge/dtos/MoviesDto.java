package com.mybinge.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public class MoviesDto {

        private Long id;
        private String movieName;
        private String runtime;
        private String year;
        private String description;
        private String ratings;
        private String cast;
        private String director;
        private String genre;
        private String posterlink;
        private String category;




        // Getter and Setter for id
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        // Getter and Setter for movieName
        public String getMovieName() {
            return movieName;
        }

        public void setMovieName(String movieName) {
            this.movieName = movieName;
        }


        // Getter and Setter for runtime
        public String getRuntime() {
            return runtime;
        }

        public void setRuntime(String runtime) {
            this.runtime = runtime;
        }

        // Getter and Setter for year
        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        // Getter and Setter for description
        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        // Getter and Setter for ratings
        public String getRatings() {
            return ratings;
        }

        public void setRatings(String ratings) {
            this.ratings = ratings;
        }

        // Getter and Setter for cast
        public String getCast() {
            return cast;
        }

        public void setCast(String cast) {
            this.cast = cast;
        }

        // Getter and Setter for director
        public String getDirector() {
            return director;
        }

        public void setDirector(String director) {
            this.director = director;
        }

        // Getter and Setter for genre
        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        // Getter and Setter for posterlink
        public String getPosterlink() {
            return posterlink;
        }

        public void setPosterlink(String posterlink) {
            this.posterlink = posterlink;
        }

        // Getter and Setter for posterlink
        public String getcategory() {
            return posterlink;
        }

        public void getcategory(String posterlink) {
            this.posterlink = posterlink;
        }

        // toString method
        @Override
        public String toString() {
            return "MoviesDto{" +
                    "id=" + id +
                    ", movieName='" + movieName + '\'' +
                    ", runtime='" + runtime + '\'' +
                    ", year='" + year + '\'' +
                    ", description='" + description + '\'' +
                    ", ratings='" + ratings + '\'' +
                    ", cast='" + cast + '\'' +
                    ", director='" + director + '\'' +
                    ", genre='" + genre + '\'' +
                    ", posterlink='" + posterlink + '\'' +
                    ", category='" + category +'\''+
                    '}';
        }
    }

