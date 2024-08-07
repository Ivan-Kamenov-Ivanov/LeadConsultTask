package com.leadconsult.app.controller;

import com.leadconsult.app.dto.StudentTeacherDTO;
import com.leadconsult.app.api.StudentService;
import com.leadconsult.app.api.TeacherService;
import com.leadconsult.app.models.Student;
import com.leadconsult.app.models.Teacher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/all")
public class StudentTeacherController {

    private final StudentService studentService;
    private final TeacherService teacherService;

    public StudentTeacherController(StudentService studentService, TeacherService teacherService) {
        this.studentService = studentService;
        this.teacherService = teacherService;
    }

    @GetMapping("/course/{courseId}/group/{groupId}/participants")
    public StudentTeacherDTO findAllStudentsAndTeachersByCourseAndGroup(@PathVariable Long courseId,
                                                                        @PathVariable Long groupId) {
        List<Student> students = new ArrayList<>(
                studentService.findAllStudentsByCourseIdAndGroupId(courseId, groupId));
        List<Teacher> teachers = new ArrayList<>(
                teacherService.findAllTeachersByCourseAndGroupId(courseId, groupId));

        return new StudentTeacherDTO(students, teachers);
    }

}
