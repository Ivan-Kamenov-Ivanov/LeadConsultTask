package com.leadconsult.app.api;

import com.leadconsult.app.models.Course;

public interface CourseService {

    boolean addCourse(Course course);

    boolean deleteCourse(Course course);

    Course findCourseById(long id);
}
