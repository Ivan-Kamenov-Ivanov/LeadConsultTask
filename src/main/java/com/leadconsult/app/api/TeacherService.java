package com.leadconsult.app.api;

import com.leadconsult.app.models.Teacher;

public interface TeacherService {

    boolean addTeacher(Teacher teacher);

    boolean deleteTeacherById(Long id);

    Teacher findTeacherById(Long id);

    Teacher updateTeacher(Teacher teacher);
}
