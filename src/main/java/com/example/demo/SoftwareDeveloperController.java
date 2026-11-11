package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/software-dev")

public class SoftwareDeveloperController {

    @GetMapping
    public List<SoftwareDevelopers> getSoftwareDevelopers()
    {
        return  List.of
                (
                new SoftwareDevelopers(
                        1,
                        "Moe",
                        "Moe@gmail.com",
                        List.of("Java","JS","Mode")
                ),
                new SoftwareDevelopers(
                       2,
                       "Andile",
                       "Andile@gmail.com",
                       List.of("Java","JS","Mode")
                )
        );
    }
}
