package com.leadconsult.app.service;

import com.leadconsult.app.api.StudentService;
import com.leadconsult.app.models.Student;
import com.leadconsult.app.repo.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student addStudent(Student student) {
        try {
            return studentRepository.save(student);
        } catch (IllegalArgumentException e){
            throw new IllegalArgumentException("Invalid data", e);
        }
    }

    @Override
    public Student findStudentById(Long id) {
        Optional<Student> result = studentRepository.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student updatedStudent) {
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
        return studentRepository.findByCourses_Id(courseId);
    }

    @Override
    public List<Student> findAllStudentsByGroupId(Long groupId) {
        return studentRepository.findByGroups_Id(groupId);
    }

    @Override
    public List<Student> findAllStudentsByCourseIdAndGroupId(Long courseId, Long groupId) {
        return studentRepository.findByCourses_IdAndGroups_Id(courseId, groupId);
    }

    @Override
    public List<Student> findStudentsOlderByAgeAndCourseId(int age, Long courseId) {
        return studentRepository.findByAgeGreaterThanAndCourses_Id(age, courseId);
    }

    @Override
    public boolean deleteStudentById(Long id) {
        if(studentRepository.existsById(id)){
            studentRepository.deleteById(id);
                return true;
        }
        return false;
    }
}
