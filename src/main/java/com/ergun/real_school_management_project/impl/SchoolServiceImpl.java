package com.ergun.real_school_management_project.impl;

import com.ergun.real_school_management_project.dto.SchoolDto;
import com.ergun.real_school_management_project.entity.School;
import com.ergun.real_school_management_project.service.SchoolService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {
    @Override
    public SchoolDto get(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public SchoolDto update(String id, SchoolDto dto) {
        return null;
    }

    @Override
    public List<SchoolDto> getAll() {
        return List.of();
    }

    @Override
    public School findById(Long schoolId) {
        return null;
    }

    @Override
    public SchoolDto create(SchoolDto dto) {
        return null;
    }
}
