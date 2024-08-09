package com.leadconsult.app.api;

import com.leadconsult.app.models.Teacher;

import java.util.List;

public interface TeacherService {

    Teacher addTeacher(Teacher teacher);

    List<Teacher> findAllTeachers();

    Teacher findTeacherById(Long id);

    List<Teacher> findAllTeachersByCourseAndGroupId(Long courseId, Long groupId);

    Teacher updateTeacher(Teacher teacher);

    boolean deleteTeacherById(Long id);
}
