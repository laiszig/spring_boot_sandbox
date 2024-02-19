package com.laiszig.section1quickstart.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //Using values from application.properties with @Value annotation
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;


}
