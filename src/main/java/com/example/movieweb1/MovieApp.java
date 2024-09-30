package com.example.movieweb1;

// 

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MovieApp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String genre;
    private boolean popular;
    private String poster;
    public Long getId() {
        return id;
    }
    public MovieApp() {
    }
    public MovieApp(Long id, String title, String genre, boolean popular, String poster) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.popular = popular;
        this.poster = poster;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public boolean isPopular() {
        return popular;
    }
    public void setPopular(boolean popular) {
        this.popular = popular;
    }
    public String getPoster() {
        return poster;
    }
    public void setPoster(String poster) {
        this.poster = poster;
    }
}
  
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   





















   
   
   
   
   





















   








   

   
   
   
   
   
   
   
   


