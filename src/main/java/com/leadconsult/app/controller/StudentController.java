package com.leadconsult.app.controller;

import com.leadconsult.app.api.StudentService;
import com.leadconsult.app.models.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping
    public List<Student> findAllStudents(){
        return studentService.findAllStudents();
    }

    @GetMapping
    public List<Student> findAllStudentsByCourseId(@PathVariable Long id){
        return studentService.findAllStudentsByCourseId(id);
    }

    @GetMapping
    public List<Student> findAllStudentsByGroupId(@PathVariable Long groupId){
        return studentService.findAllStudentsByGroupId(groupId);
    }

    @GetMapping("/olderThan/{age}/course/{courseId}")
    public List<Student> findStudentsOlderByAgeAndCourseId(@PathVariable int age,
                                                           @PathVariable Long courseId){
        return studentService.findStudentsOlderByAgeAndCourseId(age, courseId);
    }

    @GetMapping("/{id}")
    public Student findStudentById(@PathVariable Long id){
        return studentService.findStudentById(id);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable Long id){
        studentService.deleteStudentById(id);
    }
}
