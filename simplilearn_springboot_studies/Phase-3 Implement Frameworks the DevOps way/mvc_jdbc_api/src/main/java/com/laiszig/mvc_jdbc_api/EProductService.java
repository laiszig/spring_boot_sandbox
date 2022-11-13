package com.laiszig.mvc_jdbc_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EProductService {

    @Autowired
    EProductDAO productDao;

    public List<EProduct> getProducts() {
        return productDao.getProducts();
    }
}
