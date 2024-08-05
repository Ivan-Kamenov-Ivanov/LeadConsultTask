package com.leadconsult.app.service;

import com.leadconsult.app.api.TeacherService;
import com.leadconsult.app.models.Student;
import com.leadconsult.app.models.Teacher;
import com.leadconsult.app.repo.TeacherRepository;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public boolean addTeacher(Teacher teacher) {
        return false;
    }

    @Override
    public boolean deleteTeacher(Teacher teacher) {
        return false;
    }

    @Override
    public Teacher findTeacher(String name) {
        return null;
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) {
        return null;
    }
}
