package com.laiszig.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mvc")
public class SomethingWrongController {

    @GetMapping("/does-it-work")
    public String itDoesNotWork() {
        throw new IllegalStateException("No it does not");
    }

    @GetMapping("/does-it-work-in-general")
    public String itDoesNotWorkInGeneral() {
        throw new RuntimeException("No it does not");
    }
}
