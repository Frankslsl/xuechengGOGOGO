package com.xuecheng.content.model.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@lombok.Getter
@lombok.Setter
@Entity
@Table(name = "course_market")
public class CourseMarket {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @javax.validation.constraints.Size(max = 32)
    @javax.validation.constraints.NotNull
    @Column(name = "charge", nullable = false, length = 32)
    private String charge;

    @Column(name = "price")
    private Float price;

    @Column(name = "original_price")
    private Float originalPrice;

    @javax.validation.constraints.Size(max = 32)
    @Column(name = "qq", length = 32)
    private String qq;

    @javax.validation.constraints.Size(max = 64)
    @Column(name = "wechat", length = 64)
    private String wechat;

    @javax.validation.constraints.Size(max = 32)
    @Column(name = "phone", length = 32)
    private String phone;

    @Column(name = "valid_days")
    private Integer validDays;

}