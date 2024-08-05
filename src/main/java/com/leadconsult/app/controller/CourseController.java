package com.leadconsult.app.controller;

import com.leadconsult.app.service.MainCourseServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class CourseController {

    private final MainCourseServiceImpl mainCourseService;

    public CourseController(MainCourseServiceImpl mainCourseService) {
        this.mainCourseService = mainCourseService;
    }
}
