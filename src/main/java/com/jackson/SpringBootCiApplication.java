package com.jackson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootCiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCiApplication.class, args);
    }

    @RequestMapping(value = "/{name}")
    @ResponseBody
    public String basePage(@PathVariable("name") String name) {
        return "You are: " + name;
    }
}
