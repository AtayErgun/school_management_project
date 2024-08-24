package com.ergun.real_school_management_project.repository;


import com.ergun.real_school_management_project.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}
