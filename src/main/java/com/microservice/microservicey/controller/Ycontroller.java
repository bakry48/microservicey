package com.bakry.microservicex.controller;

import com.bakry.microservicex.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Xcontroller {
    private final Configuration configuration;

    public Xcontroller(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/xstring")
    public String getXString(){
        return configuration.getStr();
    }
}
