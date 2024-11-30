package com.xuecheng.content.repository;

import com.xuecheng.content.model.po.CourseBase;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.Nullable;

import java.util.List;

public interface CourseBaseRepository extends JpaRepository<CourseBase, Long> {
    Page<CourseBase> findByNameContainsIgnoreCase(@Nullable String name, Pageable pageable);

    @Query("select c from CourseBase c " +
            "where upper(c.name) like upper(concat('%', ?1, '%')) and upper(c.auditStatus) like upper(concat('%', ?2, '%'))")
    Page<CourseBase> findByNameContainsIgnoreCaseAndAuditStatusContainsIgnoreCase(@Nullable String name, @Nullable String auditStatus, Pageable pageable);
}