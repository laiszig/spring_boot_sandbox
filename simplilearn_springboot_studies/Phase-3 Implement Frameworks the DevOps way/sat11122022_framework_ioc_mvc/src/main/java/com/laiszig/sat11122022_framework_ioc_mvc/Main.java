package com.laiszig.sat11122022_framework_ioc_mvc;

import com.laiszig.sat11122022_framework_ioc_mvc.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

    ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");

    Employee e = (Employee) appContext.getBean("e1");
        System.out.println(e.getFirstName() + " " + e.getLastName() +
                " " + e.getAddress().getCity() + " " + e.getAddress().getState() +
                " " + e.getAddress().getState() + " " + e.getAddress().getCountry());
    }
}
