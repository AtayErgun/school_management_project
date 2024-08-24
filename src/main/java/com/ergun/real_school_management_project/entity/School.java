package com.ergun.real_school_management_project.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    @OneToMany(mappedBy = "school" ,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Manager> managerList;
    @OneToMany(mappedBy = "school",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Classroom>classroomList;
}
