package com.inmobi.thriftself.service.dao;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "courses")
@NamedQueries({
        @NamedQuery(name = "Courses.getList",
                query = "SELECT course FROM CourseDao course"),
        @NamedQuery(name = "Courses.getListByName",
                query = "SELECT course FROM CourseDao course where course.courseName like :courseName"),
        @NamedQuery(name = "Courses.getListBySem",
                query = "SELECT course FROM CourseDao course where course.courseSemester = :courseSemester")
})

@NoArgsConstructor
@Data
public class CourseDao implements Serializable {

    @Id
    @SequenceGenerator(name="index_sequence", sequenceName="index_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="index_sequence")
    @Column(name = "index", columnDefinition = "SERIAL")
    private Integer index;

    @Column(name = "course_name", nullable = false, columnDefinition = "TEXT")
    private String courseName;

    @Column(name = "course_department", nullable = false, columnDefinition = "TEXT")
    private String courseDepartment;

    @Column(name = "course_semester", nullable = false)
    private Integer courseSemester;
}
