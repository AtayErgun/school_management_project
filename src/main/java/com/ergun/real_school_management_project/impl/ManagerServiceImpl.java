package com.ergun.real_school_management_project.impl;

import com.ergun.real_school_management_project.dto.ManagerDto;
import com.ergun.real_school_management_project.entity.Manager;
import com.ergun.real_school_management_project.service.ManagerService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ManagerServiceImpl implements ManagerService {
    @Override
    public ManagerDto save(ManagerDto dto) {
        return null;
    }

    @Override
    public ManagerDto get(String id) {
        return null;
    }

    @Override
    public List<Manager> findBySchoolId(Long schoolId) {
        return List.of();
    }

    @Override
    public ManagerDto update(String id, ManagerDto dto) {
        return null;
    }

    @Override
    public List<ManagerDto> getAll() {
        return List.of();
    }

    @Override
    public void delete(String id) {

    }
}
