package com.laizig.springcoredemo.config;

import com.laizig.springcoredemo.common.Coach;
import com.laizig.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
