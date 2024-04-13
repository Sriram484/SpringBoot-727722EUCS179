package com.example.qno1.config;

import org.springframework.beans.factory.annotation.Value;

public class ApiConfig {

    @Value("${myapp.name}")
    private String studentName;

    @Value("${myapp.dept}")
    private String studentDepartment;

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentDepartment() {
        return studentDepartment;
    }
    public void setStudentDepartment(String studentDepartment) {
        this.studentDepartment = studentDepartment;
    }
    public ApiConfig(String studentName, String studentDepartment) {
        this.studentName = studentName;
        this.studentDepartment = studentDepartment;
    }
}