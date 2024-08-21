package com.students.Students;


import lombok.Data;

@Data
@Entity
public class Student {
    @Id

    private Integer id;
    private String name;
    private Integer age;
    private String course;
    private String place;
}
