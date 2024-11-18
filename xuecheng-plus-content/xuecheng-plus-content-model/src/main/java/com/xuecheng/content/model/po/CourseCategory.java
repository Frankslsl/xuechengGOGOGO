package com.xuecheng.content.model.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@lombok.Getter
@lombok.Setter
@Entity
@Table(name = "course_category")
public class CourseCategory {
    @Id
    @javax.validation.constraints.Size(max = 20)
    @Column(name = "id", nullable = false, length = 20)
    private String id;

    @javax.validation.constraints.Size(max = 32)
    @javax.validation.constraints.NotNull
    @Column(name = "name", nullable = false, length = 32)
    private String name;

    @javax.validation.constraints.Size(max = 32)
    @Column(name = "label", length = 32)
    private String label;

    @javax.validation.constraints.Size(max = 20)
    @javax.validation.constraints.NotNull
    @Column(name = "parentid", nullable = false, length = 20)
    private String parentid;

    @Column(name = "is_show")
    private Byte isShow;

    @Column(name = "orderby")
    private Integer orderby;

    @Column(name = "is_leaf")
    private Byte isLeaf;

}