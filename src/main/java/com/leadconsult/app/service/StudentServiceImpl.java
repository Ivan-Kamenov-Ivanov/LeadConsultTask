package com.leadconsult.app.service;

import com.leadconsult.app.api.StudentService;
import com.leadconsult.app.models.Student;
import com.leadconsult.app.repo.CourseRepository;
import com.leadconsult.app.repo.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository, CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student addStudent(Student student) {                //custom Exception handling to be added
        if (studentRepository.existsById(student.getId())) {
            return studentRepository.save(student);
        }
        return null;
    }

    @Override
    public Student findStudentById(Long id) {                   //custom Exception handling to be added
        Optional<Student> result = studentRepository.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
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

    @Override
    public List<Student> findAllStudentsByCourseId(Long courseId) {
        return studentRepository.findAllStudentsByCourseId(courseId);
    }

    @Override
    public List<Student> findAllStudentsByGroupId(Long groupId) {
        return studentRepository.findAllStudentsByGroupId(groupId);
    }

    @Override
    public List<Student> findAllStudentsByCourseIdAndGroupId(Long courseId, Long groupId) {
        return studentRepository.findAllStudentsByCourseIdAndGroupId(courseId, groupId);
    }

    @Override
    public List<Student> findStudentsOlderByAgeAndCourseId(int age, Long courseId) {
        return studentRepository.findOlderByAgeAndCourseId(age, courseId);
    }

    @Override
    public void deleteStudentById(Long id) {             //custom Exception handling to be added
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
        }

    }
}
