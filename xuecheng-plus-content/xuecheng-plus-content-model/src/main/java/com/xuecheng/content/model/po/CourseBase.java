package com.xuecheng.content.model.po;


import lombok.Data;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "course_base")
public class CourseBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @javax.validation.constraints.NotNull
    @Column(name = "company_id", nullable = false)
    private Long companyId;

    @javax.validation.constraints.Size(max = 255)
    @Column(name = "company_name")
    private String companyName;

    @javax.validation.constraints.Size(max = 100)
    @javax.validation.constraints.NotNull
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @javax.validation.constraints.Size(max = 500)
    @Column(name = "users", length = 500)
    private String users;

    @javax.validation.constraints.Size(max = 50)
    @Column(name = "tags", length = 50)
    private String tags;

    @javax.validation.constraints.Size(max = 20)
    @javax.validation.constraints.NotNull
    @Column(name = "mt", nullable = false, length = 20)
    private String mt;

    @javax.validation.constraints.Size(max = 20)
    @javax.validation.constraints.NotNull
    @Column(name = "st", nullable = false, length = 20)
    private String st;

    @javax.validation.constraints.Size(max = 32)
    @javax.validation.constraints.NotNull
    @Column(name = "grade", nullable = false, length = 32)
    private String grade;

    @javax.validation.constraints.Size(max = 32)
    @javax.validation.constraints.NotNull
    @Column(name = "teachmode", nullable = false, length = 32)
    private String teachmode;

    @Lob
    @Column(name = "description")
    private String description;

    @javax.validation.constraints.Size(max = 500)
    @Column(name = "pic", length = 500)
    private String pic;

    @Column(name = "create_date")
    private LocalDateTime createDate;

    @Column(name = "change_date")
    private Instant changeDate;

    @javax.validation.constraints.Size(max = 50)
    @Column(name = "create_people", length = 50)
    private String createPeople;

    @javax.validation.constraints.Size(max = 50)
    @Column(name = "change_people", length = 50)
    private String changePeople;

    @javax.validation.constraints.Size(max = 10)
    @javax.validation.constraints.NotNull
    @Column(name = "audit_status", nullable = false, length = 10)
    private String auditStatus;

    @javax.validation.constraints.Size(max = 10)
    @javax.validation.constraints.NotNull
    @Column(name = "status", nullable = false, length = 10)
    private String status;

}