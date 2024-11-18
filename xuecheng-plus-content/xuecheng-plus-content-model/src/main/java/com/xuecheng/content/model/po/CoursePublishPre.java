package com.xuecheng.content.model.po;

import javax.persistence.*;
import java.time.Instant;

@lombok.Getter
@lombok.Setter
@Entity
@Table(name = "course_publish_pre")
public class CoursePublishPre {
    @Id
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
    @javax.validation.constraints.NotNull
    @Column(name = "users", nullable = false, length = 500)
    private String users;

    @javax.validation.constraints.Size(max = 32)
    @Column(name = "tags", length = 32)
    private String tags;

    @javax.validation.constraints.Size(max = 32)
    @Column(name = "username", length = 32)
    private String username;

    @javax.validation.constraints.Size(max = 20)
    @javax.validation.constraints.NotNull
    @Column(name = "mt", nullable = false, length = 20)
    private String mt;

    @javax.validation.constraints.Size(max = 255)
    @javax.validation.constraints.NotNull
    @Column(name = "mt_name", nullable = false)
    private String mtName;

    @javax.validation.constraints.Size(max = 20)
    @javax.validation.constraints.NotNull
    @Column(name = "st", nullable = false, length = 20)
    private String st;

    @javax.validation.constraints.Size(max = 255)
    @javax.validation.constraints.NotNull
    @Column(name = "st_name", nullable = false)
    private String stName;

    @javax.validation.constraints.Size(max = 32)
    @javax.validation.constraints.NotNull
    @Column(name = "grade", nullable = false, length = 32)
    private String grade;

    @javax.validation.constraints.Size(max = 32)
    @javax.validation.constraints.NotNull
    @Column(name = "teachmode", nullable = false, length = 32)
    private String teachmode;

    @javax.validation.constraints.Size(max = 500)
    @javax.validation.constraints.NotNull
    @Column(name = "pic", nullable = false, length = 500)
    private String pic;

    @Lob
    @Column(name = "description")
    private String description;

    @Lob
    @Column(name = "market")
    private String market;

    @Lob
    @Column(name = "teachplan")
    private String teachplan;

    @Lob
    @Column(name = "teachers")
    private String teachers;

    @Column(name = "create_date")
    private Instant createDate;

    @Column(name = "audit_date")
    private Instant auditDate;

    @javax.validation.constraints.Size(max = 10)
    @Column(name = "status", length = 10)
    private String status;

    @javax.validation.constraints.Size(max = 500)
    @Column(name = "remark", length = 500)
    private String remark;

    @javax.validation.constraints.Size(max = 32)
    @Column(name = "charge", length = 32)
    private String charge;

    @Column(name = "price")
    private Float price;

    @Column(name = "original_price")
    private Float originalPrice;

    @Column(name = "valid_days")
    private Integer validDays;

}