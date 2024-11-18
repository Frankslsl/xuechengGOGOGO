package com.xuecheng.content.model.po;

import javax.persistence.*;
import java.time.Instant;

@lombok.Getter
@lombok.Setter
@Entity
@Table(name = "teachplan")
public class Teachplan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @javax.validation.constraints.Size(max = 64)
    @javax.validation.constraints.NotNull
    @Column(name = "pname", nullable = false, length = 64)
    private String pname;

    @javax.validation.constraints.NotNull
    @Column(name = "parentid", nullable = false)
    private Long parentid;

    @javax.validation.constraints.NotNull
    @Column(name = "grade", nullable = false)
    private Short grade;

    @javax.validation.constraints.Size(max = 10)
    @Column(name = "media_type", length = 10)
    private String mediaType;

    @Column(name = "start_time")
    private Instant startTime;

    @Column(name = "end_time")
    private Instant endTime;

    @javax.validation.constraints.Size(max = 500)
    @Column(name = "description", length = 500)
    private String description;

    @javax.validation.constraints.Size(max = 30)
    @Column(name = "timelength", length = 30)
    private String timelength;

    @Column(name = "orderby")
    private Integer orderby;

    @javax.validation.constraints.NotNull
    @Column(name = "course_id", nullable = false)
    private Long courseId;

    @Column(name = "course_pub_id")
    private Long coursePubId;

    @javax.validation.constraints.NotNull
    @Column(name = "status", nullable = false)
    private Integer status;

    @Column(name = "is_preview")
    private Character isPreview;

    @Column(name = "create_date")
    private Instant createDate;

    @Column(name = "change_date")
    private Instant changeDate;

}