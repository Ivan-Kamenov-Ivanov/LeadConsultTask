package com.leadconsult.app.service;

import com.leadconsult.app.api.StudentService;
import com.leadconsult.app.models.Student;
import com.leadconsult.app.repo.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public boolean addStudent(Student student) {
        studentRepository.save(new Student());
        return true;
    }

    @Override
    public boolean deleteStudent(Student student) {
        return false;
    }

    @Override
    public Student findStudent(String name) {
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }
}
