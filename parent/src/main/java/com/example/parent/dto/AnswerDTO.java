package com.example.parent.dto;

import java.io.Serializable;

/**
 * @author: suncl
 * @date: 2019-12-21 11:17:43
 * @version: V1.0
 */
public class AnswerDTO<T> implements Serializable {
        private String message;
        private T content;
        private String code;

        public AnswerDTO(String message, T content, Enum code) {
            this.message = message;
            this.content = content;
            this.code = code.name();
        }

        public AnswerDTO(String message, T content, String code) {
            this.message = message;
            this.content = content;
            this.code = code;
        }

        public AnswerDTO() {
        }

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public T getContent() {
            return this.content;
        }

        public void setContent(T content) {
            this.content = content;
        }

        public String getCode() {
            return this.code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public void setCode(Enum code) {
            this.code = code.name();
        }
}
