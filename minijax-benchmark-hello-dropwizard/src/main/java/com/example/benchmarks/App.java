package com.example.benchmarks;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

@Path("/")
@Produces(MediaType.TEXT_PLAIN)
public class App extends Application<Configuration> {

    @GET
    public static String hello() {
        return "Hello World";
    }

    @Override
    public void run(final Configuration config, final Environment environment) {
        environment.jersey().register(App.class);
    }

    public static void main(final String[] args) throws Exception {
        new App().run("server");
    }
}
