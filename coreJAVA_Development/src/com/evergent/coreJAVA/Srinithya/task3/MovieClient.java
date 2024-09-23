package com.evergent.coreJAVA.Srinithya.task3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MovieClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieInterface movie = new MovieImp();
        for (;;) {
            System.out.println("1. Add Movie 2. Search by ID 3. Display All 4. Exit");
            int no = sc.nextInt();
            sc.nextLine();
            switch (no) {
                case 1:
                    System.out.println("Enter the Movie ID"); // Changed prompt from ISBN to Movie ID
                    String movieId = sc.nextLine();
                    System.out.println("Enter the movie name");
                    String name = sc.nextLine();
                    System.out.println("Enter the price");
                    int price = sc.nextInt();
                    Movie m = new Movie();
                    m.setMovieId(movieId); // Changed method call from setIsbn to setMovieId
                    m.setMovieName(name);
                    m.setPrice(price);
                    String message = movie.addMovie(m);
                    System.out.println(message);
                    break;
                case 2:
                    System.out.println("Enter the Movie ID"); // Changed prompt from ISBN to Movie ID
                    String id = sc.next();
                    movie.searchByMovieId(id); // Changed method call from searchByIsbn to searchByMovieId
                    break;
                case 3:
                    movie.getAllMovies();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
