package com.leadconsult.app.dto;

import com.leadconsult.app.models.Student;
import com.leadconsult.app.models.Teacher;

import java.util.List;

public class StudentTeacherDTO {

    private List<Student> studentList;
    private List<Teacher> teacherList;

    public StudentTeacherDTO() {
    }

    public StudentTeacherDTO(List<Student> studentList, List<Teacher> teacherList) {
        this.studentList = studentList;
        this.teacherList = teacherList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
}
