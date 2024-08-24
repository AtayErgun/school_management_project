package com.ergun.real_school_management_project.response;

import com.ergun.real_school_management_project.dto.ManagerDto;
import com.ergun.real_school_management_project.dto.ClassroomDto;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SchoolResponse extends BaseResponse{
    private Long id;
    private String name;
    private String address;
    private List<ManagerDto> managerList;
    private List<ClassroomDto> classroomList;
}
