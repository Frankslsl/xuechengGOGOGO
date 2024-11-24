package com.xuecheng.content.repository;

import com.xuecheng.content.model.po.CourseCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseCategoryRepository extends JpaRepository<CourseCategory, String> {
}