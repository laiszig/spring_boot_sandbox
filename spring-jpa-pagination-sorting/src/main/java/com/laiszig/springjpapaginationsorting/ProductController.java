package com.laiszig.springjpapaginationsorting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/firstPage")
    public List<Product> getFirstPageWithTwoElementsByPrice(@RequestParam double price) {
        return productService.getFirstPageWithTwoElementsByPrice(price);
    }

    @GetMapping("/secondPage")
    public List<Product> getSecondPageWithFiveElementsByPrice(@RequestParam double price) {
        return productService.getSecondPageWithFiveElementsByPrice(price);
    }
}
