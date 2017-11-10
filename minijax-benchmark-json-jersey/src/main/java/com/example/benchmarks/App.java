package com.example.benchmarks;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.ResourceConfig;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class App {

    @GET
    public static Map<String, String> hello() {
        final Map<String, String> result = new HashMap<>();
        result.put("message", "Hello World!");
        return result;
    }

    public static void main(final String[] args) throws Exception {
        JettyHttpContainerFactory.createServer(
                UriBuilder.fromUri("http://localhost:8080/").build(),
                new ResourceConfig(App.class, JacksonFeature.class));
    }
}
