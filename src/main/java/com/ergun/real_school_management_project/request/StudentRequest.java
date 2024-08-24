package com.ergun.real_school_management_project.request;

import lombok.*;

import java.util.Date;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequest {
    private String name;
    private Date birthDay;
    private String birthPlace;
    private String tckn;
    private String schoolNo;
    private Long classroomId;

}
