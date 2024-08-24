package com.ergun.real_school_management_project.controller;

import com.ergun.real_school_management_project.dto.SchoolDto;
import com.ergun.real_school_management_project.request.SchoolRequest;
import com.ergun.real_school_management_project.response.SchoolResponse;
import com.ergun.real_school_management_project.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("schools")
public class SchoolController {
    @Autowired
    private SchoolService service;

    @GetMapping("/{id}")
    private SchoolResponse get(@PathVariable String id) {
        return toResponse(service.get(id));
    }

    @GetMapping
    private List<SchoolResponse> getAll() {
        return mapSchoolResponses(service.getAll());
    }

    private List<SchoolResponse> mapSchoolResponses(List<SchoolDto> dtos) {
        return dtos.stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }

    @PostMapping()
    private SchoolResponse create(@RequestBody SchoolRequest schoolRequest) {
        return toResponse(service.create(toDto(schoolRequest)));
    }

    @DeleteMapping("/{id}")
    private void delete(@PathVariable String id) {
        service.delete(id);
    }

    @PutMapping("/{id}")
    private SchoolResponse update(@PathVariable String id, @RequestBody SchoolRequest request) {
        return toResponse(service.update(id, toDto(request)));
    }


    private SchoolDto toDto(SchoolRequest schoolRequest) {
        return SchoolDto.builder()
                .address(schoolRequest.getAddress())
                .name(schoolRequest.getName()).build();
    }

    private SchoolResponse toResponse(SchoolDto schoolDto) {
        SchoolResponse schoolResponse = new SchoolResponse();
        schoolResponse.setId(schoolDto.getId());
        schoolResponse.setName(schoolDto.getName());
        schoolResponse.setAddress(schoolDto.getAddress());
        schoolResponse.setManagerList(schoolDto.getManagerList());
        schoolResponse.setClassroomList(schoolDto.getClassroomList());
        return schoolResponse;
    }
}
