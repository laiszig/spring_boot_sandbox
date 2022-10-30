package com.laiszig.consume_restful_web_service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumeRestfulWebServiceApplication {

    private static final Logger log =
            LoggerFactory.getLogger(ConsumeRestfulWebServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ConsumeRestfulWebServiceApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Book book = restTemplate.getForObject(
                    "http://localhost:8080/books/1", Book.class);
            log.info(book.toString());
        };
    }

}
