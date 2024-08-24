package com.ergun.real_school_management_project.service;

import com.ergun.real_school_management_project.dto.ManagerDto;
import com.ergun.real_school_management_project.entity.Manager;

import java.util.List;

public interface ManagerService {
    public ManagerDto save(ManagerDto dto);

    public ManagerDto get(String id);

    public List<Manager> findBySchoolId(Long schoolId);

    ManagerDto update(String id, ManagerDto dto);

    List<ManagerDto> getAll();

    void delete(String id);


}
