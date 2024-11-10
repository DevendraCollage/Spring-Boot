package com.edigest.myFirstProject;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    public String bark() {
        return "Dog barking!";
    }
}
