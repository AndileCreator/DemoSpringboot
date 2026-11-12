package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/students")
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

    @GetMapping
    public List<Student> getAllStudents(){
        return students;
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id){
        for(Student student : students){

            if(student.id() == id){
                return student;
            }
        }
        return null;
    }
}
