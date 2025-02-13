package com.ergun.real_school_management_project.controller;

import com.ergun.real_school_management_project.dto.ClassroomDto;
import com.ergun.real_school_management_project.request.ClassroomRequest;
import com.ergun.real_school_management_project.response.ClassroomResponse;
import com.ergun.real_school_management_project.response.SchoolResponse;
import com.ergun.real_school_management_project.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("classrooms")
public class ClassroomController {

    @Autowired
    private ClassroomService service;


    @PostMapping
    public ClassroomResponse save(@RequestBody ClassroomRequest request) {
        return toResponse(service.save(toDto(request)));
    }

    @GetMapping("/{id}")
    private ClassroomResponse get(@PathVariable String id) {
        return toResponse(service.get(id));
    }

    @DeleteMapping("/{id}")
    private void delete(@PathVariable String id) {
        service.delete(id);
    }

    @PutMapping("/{id}")
    private ClassroomResponse update(@PathVariable String id, @RequestBody ClassroomRequest request) {
        return toResponse(service.update(id, toDto(request)));
    }

    @GetMapping
    private List<ClassroomResponse> getAll() {
        return mapClassroomResponses(service.getAll());
    }

    private List<ClassroomResponse> mapClassroomResponses(List<ClassroomDto> dtos) {
        return dtos.stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }

    private ClassroomResponse toResponse(ClassroomDto dto) {
        ClassroomResponse classroomResponse = new ClassroomResponse();
        classroomResponse.setId(dto.getId());
        classroomResponse.setName(dto.getName());
        classroomResponse.setStudentList(dto.getStudentList());
        classroomResponse.setTeacherList(dto.getTeacherList());
        classroomResponse.setSchoolId(dto.getSchoolId());
        return classroomResponse;
    }

    private ClassroomDto toDto(ClassroomRequest request) {
        return ClassroomDto.builder()
                .name(request.getName())
                .schoolId(request.getSchoolId())  // Ensure schoolId is set
                .build();
    }

}
