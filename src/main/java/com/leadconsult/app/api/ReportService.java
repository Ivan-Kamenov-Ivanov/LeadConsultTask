package com.leadconsult.app.api;

import com.leadconsult.app.models.Course;
import com.leadconsult.app.models.Group;
import com.leadconsult.app.dto.StudentTeacherDTO;
import com.leadconsult.app.models.Student;

import java.util.List;

public interface ReportService {

    int countAllStudents();
    int countAllTeachers();
    int countAllCourses();
    List<Student> findAllStudentsByCourse(Course course);
    List<Student> findAllStudentsByGroup(Group group);
    StudentTeacherDTO findAllStudentsAndTeachersByCourseAndGroup(Course course, Group group);
    List<Student> findAllStudentsOlderThanAge(int age);
}
