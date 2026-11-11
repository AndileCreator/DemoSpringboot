package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/students")

public class StudentController {
    @GetMapping
    public Student getStudent()
    {
        return List.of(new Student(
                1,
                "Andile",
                "Magwaza",
                "magwaza@gmail.com",
                "Java"
        ),
        new Student(
                2,
                "lONA",
                "Hans",
                "hans@gmail.com",
                "Js"
        )
        );
    }
}
