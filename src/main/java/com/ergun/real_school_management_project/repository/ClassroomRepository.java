package com.ergun.real_school_management_project.repository;

import com.ergun.real_school_management_project.entity.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClassroomRepository extends JpaRepository<Classroom,Long> {
    List<Classroom> findBySchoolId(Long schoolId);

}
