package com.leadconsult.app.api;

import com.leadconsult.app.models.Student;

public interface StudentService {

    boolean addStudent(Student student);

    boolean deleteStudentById(Long id);

    Student findStudentById(Long id);

    Student updateStudent(Student updatedStudent);
}
