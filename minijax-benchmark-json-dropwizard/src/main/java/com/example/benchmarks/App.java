package com.example.benchmarks;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class App extends Application<Configuration> {

    @GET
    public static Map<String, String> hello() {
        final Map<String, String> result = new HashMap<>();
        result.put("message", "Hello World!");
        return result;
    }

    @Override
    public void run(final Configuration config, final Environment environment) {
        environment.jersey().register(App.class);
    }

    public static void main(final String[] args) throws Exception {
        new App().run("server");
    }
}
