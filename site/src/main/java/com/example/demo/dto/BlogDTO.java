package com.example.demo.dto;

import com.sun.javafx.beans.IDProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author: suncl
 * @date: 2019-12-21 11:03:38
 * @version: V1.0
 */
@Getter
@Setter
public class BlogDTO implements Serializable {
    private Long id;
    private String title;
    private String content;
}
