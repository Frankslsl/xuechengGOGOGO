package com.xuecheng.content.model.po;

import javax.persistence.*;
import java.time.Instant;

@lombok.Getter
@lombok.Setter
@Entity
@Table(name = "teachplan_media")
public class TeachplanMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @javax.validation.constraints.Size(max = 32)
    @Column(name = "media_id", length = 32)
    private String mediaId;

    @javax.validation.constraints.NotNull
    @Column(name = "teachplan_id", nullable = false)
    private Long teachplanId;

    @javax.validation.constraints.NotNull
    @Column(name = "course_id", nullable = false)
    private Long courseId;

    @javax.validation.constraints.Size(max = 150)
    @javax.validation.constraints.NotNull
    @Column(name = "media_fileName", nullable = false, length = 150)
    private String mediaFilename;

    @Column(name = "create_date")
    private Instant createDate;

    @javax.validation.constraints.Size(max = 60)
    @Column(name = "create_people", length = 60)
    private String createPeople;

    @javax.validation.constraints.Size(max = 60)
    @Column(name = "change_people", length = 60)
    private String changePeople;

}