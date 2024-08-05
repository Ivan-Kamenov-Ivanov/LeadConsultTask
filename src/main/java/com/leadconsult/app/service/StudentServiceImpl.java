package com.leadconsult.app.service;

import com.leadconsult.app.api.StudentService;
import com.leadconsult.app.models.Student;
import com.leadconsult.app.repo.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public boolean addStudent(Student student) {                //custom Exception handling to be added
        if (studentRepository.existsById(student.getId())) {
            return false;
        }
        studentRepository.save(student);
        return true;
    }

    @Override
    public boolean deleteStudentById(Long id) {             //custom Exception handling to be added
        if (studentRepository.existsById(id)) {
            return false;
        }
        studentRepository.deleteById(id);
        return true;
    }

    @Override
    public Student findStudentById(Long id) {                   //custom Exception handling to be added
        Optional<Student> result = studentRepository.findById(id);
        return result.orElse(null);

    }

    @Override
    public Student updateStudent(Student updatedStudent) {             //custom Exception handling to be added
        Optional<Student> existingStudent = studentRepository.findById(updatedStudent.getId());
        if (existingStudent.isEmpty()) {
            return null;
        }
        existingStudent.get().setName(updatedStudent.getName());
        existingStudent.get().setAge(updatedStudent.getAge());
        return studentRepository.save(existingStudent.get());
    }
}
