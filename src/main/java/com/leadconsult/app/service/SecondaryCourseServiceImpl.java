package com.leadconsult.app.service;

import com.leadconsult.app.api.CourseService;
import com.leadconsult.app.models.Course;

public class SecondaryCourseServiceImpl implements CourseService {

    @Override
    public boolean addCourse(Course course) {
        return false;
    }

    @Override
    public boolean deleteCourse(Course course) {
        return false;
    }

    @Override
    public Course findCourseById(long id) {
        return null;
    }
}
