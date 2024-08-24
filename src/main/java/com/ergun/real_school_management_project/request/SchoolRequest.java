package com.ergun.real_school_management_project.request;

import lombok.*;
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SchoolRequest {
    private String name;
    private String address;

}
