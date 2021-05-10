package test_dpatterns;

import design_patterns.prototype.Movie;
import design_patterns.prototype.Registry;

import java.util.Calendar;
import java.util.concurrent.CancellationException;

public class TestPrototype {

    public static void main(String[] args) {

        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie") ; /* Notice that type need to be an enum */
        movie.setTitle("Creational Patterns in Java");

        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        /* Create another Movie */
        Movie anotherMovie = (Movie) registry.createItem("Movie") ;
        anotherMovie.setTitle("Gang of Four is very Hard 😢😢");
        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getUrl());





    }
}
