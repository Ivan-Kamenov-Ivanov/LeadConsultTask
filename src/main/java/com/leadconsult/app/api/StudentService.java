package com.leadconsult.app.api;

import com.leadconsult.app.models.Student;

import java.util.List;

public interface StudentService {

    Student addStudent(Student student);

    List<Student> findAllStudents();

    Student findStudentById(Long id);

    Student updateStudent(Student updatedStudent);

    void deleteStudentById(Long id);

    List<Student> findAllStudentsByCourseId(Long courseId);

    List<Student> findAllStudentsByGroupId(Long groupId);

    List<Student> findAllStudentsByCourseIdAndGroupId(Long courseId, Long groupId);

    List<Student> findStudentsOlderByAgeAndCourseId(int age, Long courseId);
}
