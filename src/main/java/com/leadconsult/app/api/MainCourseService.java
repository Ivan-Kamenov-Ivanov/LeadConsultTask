package com.leadconsult.app.api;

import com.leadconsult.app.models.MainCourse;

public interface MainCourseService {

    boolean addCourse(MainCourse course);

    boolean deleteCourseById(long id);

    MainCourse findCourseById(long id);
}
