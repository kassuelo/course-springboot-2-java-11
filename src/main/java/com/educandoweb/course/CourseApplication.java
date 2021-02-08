package com.educandoweb.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class CourseApplication {
	
    @RequestMapping("/")
    String home() {
      return "Hello World!";
    }

	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
	}

}
