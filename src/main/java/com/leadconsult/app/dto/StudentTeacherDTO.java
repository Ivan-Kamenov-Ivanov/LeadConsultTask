package com.leadconsult.app.dto;

import com.leadconsult.app.models.Student;
import com.leadconsult.app.models.Teacher;

import java.util.List;

public record StudentTeacherDTO(List<Student> students, List<Teacher> teachers) {

}
