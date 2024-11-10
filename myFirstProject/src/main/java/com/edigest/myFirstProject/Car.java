package com.edigest.myFirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Car {

    @Autowired // This is the dependency injection (this is also known as field
    // injection)
    private Dog dog; // We get the object of the other Dog class from the IOC container to the main

    @GetMapping("/car")
    public String car() {
        return dog.bark();
    }
}
