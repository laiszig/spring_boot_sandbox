package com.laiszig.sat11192022_event_handling;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.util.EventListener;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    ConfigurableBootstrapContext context = SpringApplication.run;
    context.start();
    context.stop();
}
