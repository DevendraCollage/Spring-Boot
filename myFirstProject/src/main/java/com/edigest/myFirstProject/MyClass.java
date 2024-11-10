package com.edigest.myFirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// This is the API Controller
@RestController // Annotations (means information about the classes)
public class MyClass {

    // This is the API end-point
    @GetMapping("hello")
    public String sayHello() { // This is the Simple Method
        return "Hello";
    }
}
