package com.example.benchmarks;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.minijax.Minijax;
import org.minijax.json.MinijaxJsonFeature;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class App {

    @GET
    public static Map<String, String> hello() {
        final Map<String, String> result = new HashMap<>();
        result.put("message", "Hello World!");
        return result;
    }

    public static void main(final String[] args) {
        new Minijax()
                .register(MinijaxJsonFeature.class)
                .register(App.class)
                .run(8080);
    }
}
