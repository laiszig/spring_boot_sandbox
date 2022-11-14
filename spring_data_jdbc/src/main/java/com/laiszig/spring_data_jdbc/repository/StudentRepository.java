package com.laiszig.spring_data_jdbc.repository;

import com.laiszig.spring_data_jdbc.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findByLastName(String lastName);
}
