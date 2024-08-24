package com.ergun.real_school_management_project.controller;

import com.ergun.real_school_management_project.dto.TeacherDto;
import com.ergun.real_school_management_project.request.TeacherRequest;
import com.ergun.real_school_management_project.response.TeacherResponse;
import com.ergun.real_school_management_project.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("teachers")
public class TeacherController {
    @Autowired
    private TeacherService service;

    @PostMapping
    private TeacherResponse save(@RequestBody TeacherRequest request){
        return toResponse(service.save(toDto(request)));
    }
    @GetMapping("/{id}")
    private TeacherResponse get(@PathVariable String id){
        return toResponse(service.get(id));
    }
    @DeleteMapping("/{id}")
    private void delete(@PathVariable String id){
        service.delete(id);
    }
    @PutMapping("/{id}")
    private TeacherResponse update(@PathVariable String id, @RequestBody TeacherRequest request){
        return toResponse(service.update(id,toDto(request)));
    }
    @GetMapping
    private List<TeacherResponse> getAll(){
        return mapTeacherResponses(service.getAll());
    }

    private List<TeacherResponse> mapTeacherResponses(List<TeacherDto> dtos) {
        return dtos.stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }
    private TeacherResponse toResponse(TeacherDto dto){
        TeacherResponse teacherResponse = new TeacherResponse();
        teacherResponse.setId(dto.getId());
        teacherResponse.setBirthDay(dto.getBirthDay());
        teacherResponse.setBirthPlace(dto.getBirthPlace());
        teacherResponse.setBranch(dto.getBranch());
        teacherResponse.setEmail(dto.getEmail());
        teacherResponse.setName(dto.getName());
        teacherResponse.setClassroomId(dto.getClassroomId());
        return teacherResponse;
    }

    private TeacherDto toDto(TeacherRequest request) {
        return TeacherDto.builder()
                .email(request.getEmail())
                .name(request.getName())
                .branch(request.getBranch())
                .birthDay(request.getBirthDay())
                .birthPlace(request.getBirthPlace())
                .classroomId(request.getClassroomId())
                .build();
    }
}
