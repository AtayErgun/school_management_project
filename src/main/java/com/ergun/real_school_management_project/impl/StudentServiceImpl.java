package com.ergun.real_school_management_project.impl;

import com.ergun.real_school_management_project.dto.StudentDto;
import com.ergun.real_school_management_project.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public StudentDto save(StudentDto dto) {
        return null;
    }

    @Override
    public StudentDto get(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public StudentDto update(String id, StudentDto dto) {
        return null;
    }

    @Override
    public List<StudentDto> getAll() {
        return List.of();
    }
}
