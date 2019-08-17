package com.jeni;

import java.util.ArrayList;
import java.util.Iterator;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class MovieService implements Movie {
	private ArrayList<String> favMovies;
	
	public MovieService() {
		super();
		System.out.println("Movieservice default call....");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init method.....");
		favMovies = new ArrayList<String>();
	}
	
	
	@Override
	public void addMovie(String movie) {
		favMovies.add(movie);
	}
	
	
	@Override
	public void showAllMovies() {
		Iterator<String> it = favMovies.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	@PreDestroy
	public void destroy() {
		favMovies.clear();
		System.out.println("destroy method called...");
	}
}
