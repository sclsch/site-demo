package com.example.demo.controller;

import com.example.demo.dao.BlogRepository;
import com.example.demo.domain.Blog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: suncl
 * @date: 2019-12-15 06:43:32
 * @version: V1.0
 */
@RestController
public class Demo {
    @Autowired
    private BlogRepository blogRepository;
    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @RequestMapping(value = "/")
    public String home(){
        List<Blog> all = blogRepository.findAll();
        String s  = "";
        for (Blog b:all){
            s+= b.getTitle();
        }
        return "hello,站点正在建设中..."+s;
    }
}
