package com.laiszig.sun11132022_thymeleaf_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetController {

    @GetMapping("/greet")
    public String greet(Model model, @RequestParam("name") String name) {
        model.addAttribute("name", name);
        return "hello";
    }
}

