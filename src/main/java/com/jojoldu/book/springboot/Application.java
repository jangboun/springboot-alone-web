package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 메인 클래스
// @SpringBootApplication으로 인해 스프링 부트의 자동설정, 스프링 Bean읽기와 생성을
// 모두 자동으로 설정됩니다.
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}