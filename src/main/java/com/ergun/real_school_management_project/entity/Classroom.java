package com.ergun.real_school_management_project.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    @OneToMany(mappedBy = "classroom",cascade = CascadeType.ALL)
    private List<Teacher>teacherList;

    @OneToMany(mappedBy = "classroom",cascade = CascadeType.ALL)
    private List<Student>studentList;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "school_id")
    private School school;


}
