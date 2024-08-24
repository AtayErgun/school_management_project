package com.ergun.real_school_management_project.repository;

import com.ergun.real_school_management_project.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SchoolRepository extends JpaRepository<School,Long> {

}
