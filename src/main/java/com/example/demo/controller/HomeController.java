package com.example.demo.controller;

import com.example.demo.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String hello() {
        StudentDto studentDto = new StudentDto();
        studentDto.setName("aa");
        studentDto.setNum(1);
        return studentDto.toString();
    }
}
