package com.leadconsult.app.api;

import com.leadconsult.app.models.Course;

import java.util.List;

public interface CourseService {

    Course addCourse(Course course);

    Course findCourseById(long id);

    List<Course> findAllCourses();

    boolean deleteCourseById(long id);
}
