package com.jeni;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Component;

@Component
public class DVDlibrary implements MovieLibrary, Movie {
	
	private ArrayList<String> movielist;
	
	public DVDlibrary() {
		movielist = new ArrayList<String>();
	}

	@Override
	public void getAllMovies() {
		// TODO Auto-generated method stub
		System.out.println("movie 2 is running");
		Iterator<String> it = movielist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

	@Override
	public void addMovie(String movie) {
		// TODO Auto-generated method stub
		movielist.add(movie);
		
	}

	@Override
	public void showAllMovies() {
		// TODO Auto-generated method stub
		Iterator<String> it = movielist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
