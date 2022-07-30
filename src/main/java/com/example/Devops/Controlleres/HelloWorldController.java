package com.example.Devops.Controlleres;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping(path="/hello/{name}")
    public String getEmployees(@PathVariable String name)
    {
        return "Hello " +name;
    }
}