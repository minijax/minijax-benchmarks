package com.example.benchmarks;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.minijax.Minijax;

@Path("/")
public class App {

    @GET
    public static String hello() {
        return "Hello World";
    }

    public static void main(final String[] args) {
        new Minijax().register(App.class).run(8080);
    }
}
