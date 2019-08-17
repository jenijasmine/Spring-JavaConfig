package com.jeni;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);
		ctx.scan("com.jeni");
		ctx.refresh();
		
		Movie movies = (Movie) ctx.getBean("movieService"); //bean name "movieService" is automatically generated. add @Component in MovieService
		//(or) Movie movies = (Movie) ctx.getBean("movies");
		
		movies.addMovie("Bahubali");
		movies.addMovie("Katrin mozhi");
		movies.addMovie("Singam");
		movies.addMovie("Siruthai");
		movies.addMovie("Pasanga");
		
		movies.showAllMovies();
		
		MovieLibrary movies2 = ctx.getBean(DVDlibrary.class);
		
		((DVDlibrary) movies2).addMovie("abcd");
		((DVDlibrary) movies2).addMovie("pqrs");
		((DVDlibrary) movies2).addMovie("ijkl");
		((DVDlibrary) movies2).addMovie("xyz");
		movies2.getAllMovies();
		
		 ctx.close();
	}

}
 