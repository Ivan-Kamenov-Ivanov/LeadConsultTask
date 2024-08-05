package com.leadconsult.app.api;

import com.leadconsult.app.models.Student;

public interface StudentService {

    boolean addStudent(Student student);

    boolean deleteStudent(Student student);

    Student findStudent(String name);

    Student updateStudent(Student student);
}
