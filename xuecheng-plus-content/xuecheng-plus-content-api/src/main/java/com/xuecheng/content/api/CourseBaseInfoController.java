package com.xuecheng.content.api;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.po.CourseBase;
import com.xuecheng.content.model.po.dto.QueryCourseParamsDto;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@RestController
public class CourseBaseInfoController {

    @GetMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody(required = false) QueryCourseParamsDto queryCourseParamsDto) {
        System.out.println("111");
        return null;
    }
}
