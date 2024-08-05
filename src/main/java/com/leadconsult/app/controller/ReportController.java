package com.leadconsult.app.controller;

import com.leadconsult.app.api.StudentService;
import com.leadconsult.app.api.TeacherService;
import org.springframework.stereotype.Controller;

@Controller
public class ReportController {

    private final StudentService studentService;
    private final TeacherService teacherService;

    public ReportController(StudentService studentService, TeacherService teacherService) {
        this.studentService = studentService;
        this.teacherService = teacherService;
    }
}
