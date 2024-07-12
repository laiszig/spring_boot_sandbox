package com.laiszig.springjpapaginationsorting;

import org.springframework.data.domain.Pageable;

public class ProductRequest {

    public static final Pageable firstPageWithTwoElements = org.springframework.data.domain.PageRequest.of(0, 2);

    public static final Pageable secondPageWithFiveElements = org.springframework.data.domain.PageRequest.of(1, 5);
}
