package com.laiszig.springjpapaginationsorting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.laiszig.springjpapaginationsorting.ProductRequest.firstPageWithTwoElements;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProductsByPrice(double price, Pageable pageable) {
        return productRepository.findAllByPrice(price, pageable);
    }

    public List<Product> getFirstPageWithTwoElementsByPrice(double price) {
        return productRepository.findAllByPrice(price, firstPageWithTwoElements);
    }

    public List<Product> getSecondPageWithFiveElementsByPrice(double price) {
        return productRepository.findAllByPrice(price, firstPageWithTwoElements);
    }
}
