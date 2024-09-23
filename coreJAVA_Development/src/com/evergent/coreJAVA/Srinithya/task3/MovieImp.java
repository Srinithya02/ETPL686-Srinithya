package com.evergent.coreJAVA.Srinithya.task3;

import java.util.HashSet;
import java.util.Set;

public class MovieImp implements MovieInterface {
    Set<Movie> movieSet = null;
    
    public MovieImp() {
        movieSet = new HashSet<Movie>();
    }

    @Override
    public String addMovie(Movie m) {
        movieSet.add(m);
        return m.getMovieId(); // Changed from getIsbn to getMovieId
    } 

    @Override
    public void searchByMovieId(String movieId) { // Changed method name from searchByIsbn to searchByMovieId
        boolean found = false;
        if (movieSet.size() > 0 && movieSet != null) {
            for (Movie movie : movieSet) {
                if (movie.getMovieId().equals(movieId)) { // Changed from getIsbn to getMovieId
                    System.out.println(movie.getMovieId() + " " + movie.getMovieName() + " " + movie.getPrice());    
                    found = true;
                    break;    
                }
            }
        }
        if (!found)
            System.out.println("The movie is not found");        
    }

    @Override
    public void getAllMovies() {
        if (movieSet.size() > 0) {
            for (Movie movie : movieSet) {
                System.out.println(movie.getMovieId() + " " + movie.getMovieName() + " " + movie.getPrice()); // Changed from getIsbn to getMovieId
            }            
        } else {
            System.out.println("No movies are available");
        }
    }
}
