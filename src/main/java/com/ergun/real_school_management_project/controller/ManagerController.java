package com.ergun.real_school_management_project.controller;


import com.ergun.real_school_management_project.dto.ManagerDto;
import com.ergun.real_school_management_project.request.ManagerRequest;
import com.ergun.real_school_management_project.response.ManagerResponse;
import com.ergun.real_school_management_project.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("managers")
public class ManagerController {

    @Autowired
    private ManagerService service;

    @PostMapping
    private ManagerResponse save(@RequestBody ManagerRequest request) {
        return toResponse(service.save(toDto(request)));
    }

    @GetMapping("/{id}")
    private ManagerResponse get(@PathVariable String id) {
        return toResponse(service.get(id));
    }

    @DeleteMapping("/{id}")
    private void delete(@PathVariable String id) {
        service.delete(id);
    }

    @PutMapping("/{id}")
    private ManagerResponse update(@PathVariable String id, @RequestBody ManagerRequest request) {
        return toResponse(service.update(id, toDto(request)));
    }

    @GetMapping
    private List<ManagerResponse> getAll() {
        return mapManagerResponses(service.getAll());
    }

    private List<ManagerResponse> mapManagerResponses(List<ManagerDto> dtos) {
        return dtos.stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }


    private ManagerResponse toResponse(ManagerDto dto) {
        ManagerResponse managerResponse = new ManagerResponse();
        managerResponse.setId(dto.getId());
        managerResponse.setSchoolId(dto.getSchoolId());
        managerResponse.setBirthDay(dto.getBirthDay());
        managerResponse.setBirthPlace(dto.getBirthPlace());
        managerResponse.setBranch(dto.getBranch());
        managerResponse.setEmail(dto.getEmail());
        managerResponse.setName(dto.getName());
        return managerResponse;
    }

    private ManagerDto toDto(ManagerRequest request) {
        return ManagerDto.builder()
                .name(request.getName())
                .email(request.getEmail())
                .birthDay(request.getBirthDay())
                .birthPlace(request.getBirthPlace())
                .branch(request.getBranch())
                .schoolId(request.getSchoolId())
                .build();
    }
}
