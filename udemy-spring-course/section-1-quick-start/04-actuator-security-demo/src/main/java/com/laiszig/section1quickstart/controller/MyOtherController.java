package com.laiszig.section1quickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyOtherController {

    //Expose "/" that return strings

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Do 30 pull-ups!";
    }
}
