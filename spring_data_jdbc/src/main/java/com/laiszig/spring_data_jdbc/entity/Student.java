package com.laiszig.spring_data_jdbc.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("student")
public class Student {

    @Id
    private Long studentId;
    private String firstName;
    private String lastName;
    private Integer year;


}
