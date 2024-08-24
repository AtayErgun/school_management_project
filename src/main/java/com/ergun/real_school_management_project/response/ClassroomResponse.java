package com.ergun.real_school_management_project.response;


import com.ergun.real_school_management_project.dto.StudentDto;
import com.ergun.real_school_management_project.dto.TeacherDto;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClassroomResponse extends BaseResponse{
    private Long id;
    private String name;
    private List<TeacherDto>teacherList;
    private List<StudentDto>studentList;
    private Long schoolId;
}
