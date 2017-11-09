package com.example.benchmarks;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class App {

    @RequestMapping("/")
    @ResponseBody
    public Map<String, String> hello() {
        final Map<String, String> result = new HashMap<>();
        result.put("message", "Hello World!");
        return result;
    }

    public static void main(final String[] args) {
        SpringApplication.run(App.class, args);
    }
}
