package com.laizig.springcoredemo.rest;

import com.laizig.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define a private field for the dependency
    private Coach myCoach;

//    @Autowired
//    public DemoController(@Qualifier("baseballCoach") Coach theCoach) {
//        myCoach = theCoach;
//    }
    //removed @Qualifier, so that we can use @Primary in the preferred class
    //@Qualifier has a higher priority if I use
    //@Qualifier is more specific too

    @Autowired
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }

    //Add getMapping() endpoint
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
