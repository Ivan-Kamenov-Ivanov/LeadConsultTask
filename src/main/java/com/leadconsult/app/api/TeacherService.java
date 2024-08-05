package com.leadconsult.app.api;

import com.leadconsult.app.models.Teacher;

public interface TeacherService {

    boolean addTeacher(Teacher teacher);

    boolean deleteTeacher(Teacher teacher);

    Teacher findTeacher(String name);

    Teacher updateTeacher(Teacher teacher);
}
