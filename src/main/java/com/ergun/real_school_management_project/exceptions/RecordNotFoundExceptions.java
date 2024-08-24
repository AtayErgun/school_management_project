package com.ergun.real_school_management_project.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RecordNotFoundExceptions extends RuntimeException{
    private int code;
    private String message;
}
