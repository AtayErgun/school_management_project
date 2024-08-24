package com.ergun.real_school_management_project.controller;

import com.ergun.real_school_management_project.dto.StudentDto;
import com.ergun.real_school_management_project.request.StudentRequest;
import com.ergun.real_school_management_project.response.ManagerResponse;
import com.ergun.real_school_management_project.response.StudentResponse;
import com.ergun.real_school_management_project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("students")
public class StudentController {
    @Autowired
    private StudentService service;
    @PostMapping
    private StudentResponse save(@RequestBody StudentRequest reqest ){
        return toResponse(service.save(toDto(reqest)));
    }
    @GetMapping("/{id}")
    private StudentResponse get(@PathVariable String id){
        return toResponse(service.get(id));
    }
    @PutMapping("/{id}")
    private StudentResponse update(@PathVariable String id, @RequestBody StudentRequest request){
        return toResponse(service.update(id,toDto(request)));
    }
    @DeleteMapping("/{id}")
    private void delete(@PathVariable String id){
        service.delete(id);
    }
    @GetMapping
    private List<StudentResponse> getAll(){
        return mapStudentResponses(service.getAll());
    }

    private List<StudentResponse> mapStudentResponses(List<StudentDto> dtos) {
        return dtos.stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }
    private StudentResponse toResponse(StudentDto dto){
        StudentResponse studentResponse = new StudentResponse();
        studentResponse.setId(dto.getId());
        studentResponse.setBirthDay(dto.getBirthDay());
        studentResponse.setBirthPlace(dto.getBirthPlace());
        studentResponse.setName(dto.getName());
        studentResponse.setTckn(dto.getTckn());
        studentResponse.setClassroomId(dto.getClassroomId());
        studentResponse.setSchoolNo(dto.getSchoolNo());
        return studentResponse;
    }
    private StudentDto toDto(StudentRequest request) {
        return StudentDto.builder()
                .schoolNo(request.getSchoolNo())
                .birthDay(request.getBirthDay())
                .tckn(request.getTckn())
                .birthPlace(request.getBirthPlace())
                .name(request.getName())
                .classroomId(request.getClassroomId())
                .build();
    }
}
