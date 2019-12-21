package com.example.demo.dao;

import com.example.demo.domain.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author: suncl
 * @date: 2019-12-19 22:57:24
 * @version: V1.0
 */
public interface BlogRepository extends JpaRepository<Blog, Long>, JpaSpecificationExecutor {
}
