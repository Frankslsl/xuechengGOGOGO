package com.xuecheng.content.api;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.po.CourseBase;
import com.xuecheng.content.model.po.dto.QueryCourseParamsDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Api(tags = "Course base info management system")
@RestController
public class CourseBaseInfoController {

    @ApiOperation("Get course list")
    @PostMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody(required = false) QueryCourseParamsDto queryCourseParamsDto) {
        System.out.println("111");
        CourseBase courseBase = new CourseBase();
        List<CourseBase> courseBaseList = new ArrayList<>();
        courseBase.setName("test");
        courseBase.setCreateDate(LocalDateTime.now());
        PageResult<CourseBase> courseBasePageResult = new PageResult<>(courseBaseList, 1, 10, 1);
        return courseBasePageResult;
    }
}
