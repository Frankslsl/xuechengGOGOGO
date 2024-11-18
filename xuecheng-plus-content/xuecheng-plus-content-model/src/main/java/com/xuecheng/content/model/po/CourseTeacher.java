package com.xuecheng.content.model.po;

import javax.persistence.*;
import java.time.Instant;

@lombok.Getter
@lombok.Setter
@Entity
@Table(name = "course_teacher")
public class CourseTeacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "course_id")
    private Long courseId;

    @javax.validation.constraints.Size(max = 60)
    @Column(name = "teacher_name", length = 60)
    private String teacherName;

    @javax.validation.constraints.Size(max = 255)
    @Column(name = "position")
    private String position;

    @javax.validation.constraints.Size(max = 1024)
    @Column(name = "introduction", length = 1024)
    private String introduction;

    @javax.validation.constraints.Size(max = 1024)
    @Column(name = "photograph", length = 1024)
    private String photograph;

    @Column(name = "create_date")
    private Instant createDate;

}