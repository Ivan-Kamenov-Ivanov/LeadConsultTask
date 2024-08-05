package com.leadconsult.app.service;

import com.leadconsult.app.api.ReportService;
import com.leadconsult.app.models.Course;
import com.leadconsult.app.models.Group;
import com.leadconsult.app.dto.StudentTeacherDTO;
import com.leadconsult.app.models.Student;

import java.util.List;

public class ReportServiceImpl implements ReportService {

    @Override
    public int countAllStudents() {
        return 0;
    }

    @Override
    public int countAllTeachers() {
        return 0;
    }

    @Override
    public int countAllCourses() {
        return 0;
    }

    @Override
    public List<Student> findAllStudentsByCourse(Course course) {
        return List.of();
    }

    @Override
    public List<Student> findAllStudentsByGroup(Group group) {
        return List.of();
    }

    @Override
    public StudentTeacherDTO findAllStudentsAndTeachersByCourseAndGroup(Course course, Group group) {
        return null;
    }

    @Override
    public List<Student> findAllStudentsOlderThanAge(int age) {
        return List.of();
    }
}
