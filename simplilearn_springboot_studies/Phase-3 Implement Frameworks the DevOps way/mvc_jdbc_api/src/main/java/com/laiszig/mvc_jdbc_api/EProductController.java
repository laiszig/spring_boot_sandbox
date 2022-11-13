package com.laiszig.mvc_jdbc_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class EProductController {
    @Autowired
    private EProductService eProductService;

    // STEP 1: handle request
    @GetMapping("/products")
    public String getEmployees(Model model) {

        // STEP 2: Invoke Service to execute business logic
        Collection<EProduct> products = eProductService.getProducts();

        // STEP 3: Populate model (Adding data on Model)
        model.addAttribute("prodlist", products);

        // STEP 4: Invoke View
        return "prod-list";
    }

}
