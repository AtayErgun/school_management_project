package com.ergun.real_school_management_project.service;

import com.ergun.real_school_management_project .dto.SchoolDto;
import com.ergun.real_school_management_project.entity.School;

import java.util.List;


public interface SchoolService {

    SchoolDto get(String id);
    void delete(String id);
    SchoolDto update(String id, SchoolDto dto);
    List<SchoolDto> getAll();
    public School findById(Long schoolId);


    SchoolDto create(SchoolDto dto);
}
