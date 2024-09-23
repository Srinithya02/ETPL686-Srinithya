package com.evergent.coreJAVA.Srinithya.task3;

public class Movie {
    private String movieId; // Changed from ISBN to movieId
    private String movieName;
    private int price;    
    
    public void setMovieId(String movieId) { // Changed from setIsbn to setMovieId
        this.movieId = movieId;
    }
    public String getMovieId() { // Changed from getIsbn to getMovieId
        return movieId;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getMovieName() {
        return movieName;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }        
}
