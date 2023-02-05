package com.laiszig.course_mvc_crud.repository;

import com.laiszig.course_mvc_crud.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
