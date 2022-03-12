package com.revature.apps.movie;

import java.util.ArrayList;
import java.util.Collections;

public class MovieManager {
public static void main(String[] args) {
	
	//Creating four objects of the movie class.
	Movie mov1 = new Movie(10, "Bob: The Beginning", 1999);
	Movie mov2 = new Movie(9.6, "Sue: The Superhero", 2000);
	Movie mov3 = new Movie(8, "Rob: The Finale", 1985);
	Movie mov4 = new Movie(7, "The Start of Bob", 1983);
	
	//Creating an ArrayList called Movie.
	ArrayList<Movie> movie = new ArrayList<Movie>();
	
	//Adding the objects to the ArrayList
	movie.add(mov1);
	movie.add(mov2);
	movie.add(mov3);
	movie.add(mov4);
	
	//Print ArrayList
	System.out.println(movie);
	System.out.println("");
	
	//Sort is a static method used with the class name.
	Collections.sort(movie);
	
	for(Movie mov:movie) {
		System.out.println(mov);
	}
	
	System.out.println("");
	
	RatingCompare ratingCompare = new RatingCompare();
    Collections.sort(movie, ratingCompare);
    for (Movie movi: movie) {
    	System.out.println(movi);
	}
    }
	
}

