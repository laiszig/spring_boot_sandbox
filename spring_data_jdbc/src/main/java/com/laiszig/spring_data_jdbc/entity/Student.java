package com.laiszig.spring_data_jdbc.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("student")
public class Student implements Persistable<Long> {

    @Id
    private Long studentId;
    private String firstName;
    private String lastName;
    private Integer year;

    @Transient
    @JsonIgnore
    private Boolean isInsert;

    @JsonIgnore
    @Override
    public Long getId() {
        return null;
    }

    @JsonIgnore
    @Override
    public boolean isNew() {
        return false;
    }
}
