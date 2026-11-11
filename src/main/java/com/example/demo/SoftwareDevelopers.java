package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class SoftwareDevelopers {
    private Integer id;
    private String name;
    private String email;
    public List<String> techStack;

    public SoftwareDevelopers(int id, String name, String email, List<String> techStack) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.techStack = techStack;
    }

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public List<String> getTechStack() {return techStack;}
}
