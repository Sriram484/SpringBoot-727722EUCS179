package com.example.qno1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.qno1.config.ApiConfig;

@RestController
public class ApiController {
    
    @Autowired
    ApiConfig obj;

   
    

    @GetMapping("/info")
    public String demo()
    {
        return "Student Name: "+obj.getStudentName()+", Department:"+obj.getStudentDepartment();
    }

}
