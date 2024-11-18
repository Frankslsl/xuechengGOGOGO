package com.xuecheng.content.model.po.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: QueryCourseParamsDto: Query about the course
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryCourseParamsDto {

    private String auditStatus;
    private String courseName;
    private String publishStatus;

}
