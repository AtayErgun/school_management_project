package com.ergun.real_school_management_project.request;

import lombok.*;

import java.util.Date;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ManagerRequest {
    private String name;
    private String birthPlace;
    private Date birthDay;
    private String email;
    private String branch;
    private Long schoolId;
}
