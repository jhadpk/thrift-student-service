package com.inmobi.thriftself.service.dao;

import com.inmobi.thriftself.service.enums.StudentStatusEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "students")
@NamedQueries({
        @NamedQuery(name = "Students.getList",
                query = "SELECT student FROM StudentDao student"),
        @NamedQuery(name = "Students.getListByName",
                query = "SELECT student FROM StudentDao student where student.name like :name"),
        @NamedQuery(name = "Students.getListByDepartment",
                query = "SELECT student FROM StudentDao student where student.department = :department")
})

@NoArgsConstructor
@Data
public class StudentDao implements Serializable {
    @Id
    @SequenceGenerator(name="index_sequence", sequenceName="index_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="index_sequence")
    @Column(name = "index", columnDefinition = "SERIAL")
    private Integer index;

    @Column(name = "name", nullable = false, columnDefinition = "TEXT")
    private String name;

    @Column(name = "department", nullable = false, columnDefinition = "TEXT")
    private String department;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Column(name = "address", nullable = false, columnDefinition = "TEXT")
    private String address;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private StudentStatusEnum status;
}
