package com.example.Cmp325.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;
@Entity

public class Course {
    @Id
    private String id;
    private String CourseCode;
    private String CourseTitle;
    private String CourseDescription;

    @OneToMany(mappedBy ="course") //specify the mapped by attribute
    private List<Course> students;
}
