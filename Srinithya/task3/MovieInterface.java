package com.evergent.coreJAVA.Srinithya.task3;

import java.util.Set;

public interface MovieInterface {
    String addMovie(Movie m);
    void searchByMovieId(String movieId); // Changed method name from searchByIsbn to searchByMovieId
    void getAllMovies();        
}
