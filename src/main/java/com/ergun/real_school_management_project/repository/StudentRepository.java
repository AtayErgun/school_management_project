package com.ergun.real_school_management_project.repository;


import com.ergun.real_school_management_project.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
