package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController

public class StudentController {

        List<Student> students = List.of (
                new Student(
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
        ),
                new Student(
                        3,
                        "Ntiyiso",
                        "Chauke",
                        "ntiyiso@gmail.com",
                        "CSS"
                )
        );

    @GetMapping("/api/v1/students")
    public List<Student> getAllStudents(){
        return students;
    }

    @GetMapping("/api/v1/studentId")
    public Student getStudentById(@RequestParam int id){
        return students.stream()
                .filter(student -> student.getId()== id)
                .findFirst()
                .orElse(null);
    }

}
