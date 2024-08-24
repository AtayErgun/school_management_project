package com.ergun.real_school_management_project.impl;

import com.ergun.real_school_management_project.dto.TeacherDto;
import com.ergun.real_school_management_project.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Override
    public TeacherDto save(TeacherDto dto) {
        return null;
    }

    @Override
    public TeacherDto get(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public TeacherDto update(String id, TeacherDto dto) {
        return null;
    }

    @Override
    public List<TeacherDto> getAll() {
        return List.of();
    }
}
