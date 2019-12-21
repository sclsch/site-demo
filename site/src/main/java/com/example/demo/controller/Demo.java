package com.example.demo.controller;

import com.example.demo.dao.BlogRepository;
import com.example.demo.domain.Blog;
import com.example.demo.dto.BlogDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
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
        return "hello,站点正在建设中..." ;


    }
    @RequestMapping(value = "/blog/write")
    public ResponseEntity wite(@RequestBody BlogDTO blogDTO){
         logger.info("填写博客，title:{},content:{}",blogDTO.getTitle(),blogDTO.getContent());
         Blog b = new Blog();
         b.setTitle(blogDTO.getTitle());
         b.setContent(blogDTO.getContent());
         b.setUpdateTime(new Date());
         blogRepository.save(b);
         return new ResponseEntity("write blog ok",HttpStatus.OK);
    }
}
