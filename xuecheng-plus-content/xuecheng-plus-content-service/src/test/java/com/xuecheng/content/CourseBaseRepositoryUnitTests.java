package com.xuecheng.content;

import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.po.CourseBase;
import com.xuecheng.content.model.po.dto.QueryCourseParamsDto;
import com.xuecheng.content.repository.CourseBaseRepository;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 */
@SpringBootTest
public class CourseBaseRepositoryUnitTests {
    private static final Logger log = LoggerFactory.getLogger(CourseBaseRepositoryUnitTests.class);

    @Autowired
    private CourseBaseRepository courseBaseRepository;

    @Test
    public void testCourseBaseRepositoryFindById() {
        log.warn("logger class = {}", log.getClass().getName());
        Optional<CourseBase> byId = courseBaseRepository.findById(18L);
        assert byId.isPresent();

        CourseBase courseBase = byId.get();
        log.info("courseBase.name = {}", courseBase.getName());
    }

    @Test
    public void findAllWithPage() {
        PageRequest pageRequest = PageRequest.of(0, 2);
        Page<CourseBase> all = courseBaseRepository.findAll(pageRequest);
        QueryCourseParamsDto queryCourseParamsDto = new QueryCourseParamsDto();
        queryCourseParamsDto.setCourseName("java");
        queryCourseParamsDto.setAuditStatus("202004");

        Page<CourseBase> byNameLikeIgnoreCaseAndAuditStatusIgnoreCase = courseBaseRepository.findByNameContainsIgnoreCaseAndAuditStatusContainsIgnoreCase(queryCourseParamsDto.getCourseName(), queryCourseParamsDto.getAuditStatus(), pageRequest);
        List<CourseBase> courseList = byNameLikeIgnoreCaseAndAuditStatusIgnoreCase.get().collect(Collectors.toList());
        int size = byNameLikeIgnoreCaseAndAuditStatusIgnoreCase.getSize();
        PageResult.from(byNameLikeIgnoreCaseAndAuditStatusIgnoreCase);

        log.warn(courseList.toString());


        assert all.getTotalElements() > 0;
        assert all.getPageable().isPaged() == true;
        assert all.getSize() == 2;
    }

}
