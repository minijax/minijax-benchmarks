package com.example.benchmarks;

import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class App {
    private static Gson gson = new Gson();

    public static void main(final String[] args) {
        port(8080);
        get("/", (request, response) -> {
            final Map<String, String> result = new HashMap<>();
            result.put("message", "Hello World!");
            return gson.toJson(result);
        });
    }
}
