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

    @GetMapping("/course/{id}")
    public List<Student> findAllStudentsByCourseId(@PathVariable Long id){
        return studentService.findAllStudentsByCourseId(id);
    }

    @GetMapping("/group/{id}")
    public List<Student> findAllStudentsByGroupId(@PathVariable Long id){
        return studentService.findAllStudentsByGroupId(id);
    }

    @GetMapping("/olderThan/{age}/course/{id}")
    public List<Student> findStudentsOlderByAgeAndCourseId(@PathVariable int age,
                                                           @PathVariable Long id){
        return studentService.findStudentsOlderByAgeAndCourseId(age, id);
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
