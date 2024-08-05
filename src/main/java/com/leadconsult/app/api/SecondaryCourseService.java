package com.leadconsult.app.api;

import com.leadconsult.app.models.SecondaryCourse;

public interface SecondaryCourseService {

    boolean addCourse(SecondaryCourse course);

    boolean deleteCourseById(Long id);

    SecondaryCourse findCourseById(long id);
}
