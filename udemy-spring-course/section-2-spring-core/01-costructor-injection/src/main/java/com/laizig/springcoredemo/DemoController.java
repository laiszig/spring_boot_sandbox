package com.laizig.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define a private field for the dependency
    private Coach myCoach;

    //define a constructor for dependency injection
    //Autowired annotation tells Spring to inject a dependency
    //If you only have one constructor, then @Autowired is optional
    @Autowired
    public DemoController(Coach myCoach) {
        this.myCoach = myCoach;
    }

    //Add getMapping() endpoint
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
