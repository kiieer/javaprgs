package com.revature.apps.movie;

public class Movie implements Comparable<Movie> {
	private double rating;
	private String name;
	private int year;
	
	public Movie(double rating, String name, int year) {
		super();
		this.rating = rating;
		this.name = name;
		this.year = year;
	}

	public Movie() {
		super();
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Movie [rating=" + rating + ", name=" + name + ", year=" + year + "]";
	}

	@Override
	public int compareTo(Movie m) {
		// TODO Auto-generated method stub
		return this.year - m.year;
	}

}
