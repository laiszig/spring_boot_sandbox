package com.laiszig.sun11132022_thymeleaf_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {

    @GetMapping("/greet")
    public String greet(Model model) {
        model.addAttribute("name", "Lais");
        return "hello";
    }
}

