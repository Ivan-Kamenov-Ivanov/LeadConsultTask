package com.leadconsult.app.service;

import com.leadconsult.app.api.TeacherService;
import com.leadconsult.app.models.Teacher;
import com.leadconsult.app.repo.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher addTeacher(Teacher teacher) {
        try {
            return teacherRepository.save(teacher);
        } catch (IllegalArgumentException e){
                throw new IllegalArgumentException("Invalid data", e);
        }
    }

    @Override
    public List<Teacher> findAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher findTeacherById(Long id) {
        Optional<Teacher> result = teacherRepository.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<Teacher> findAllTeachersByCourseAndGroupId(Long courseId, Long groupId) {
        return teacherRepository.findAllTeachersByCourseAndGroupId(courseId, groupId);
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) {
        Optional<Teacher> existingTeacher = teacherRepository.findById(teacher.getId());
        if(existingTeacher.isEmpty()){
            return null;
        }
        existingTeacher.get().setName(teacher.getName());
        existingTeacher.get().setAge(teacher.getAge());
        return teacherRepository.save(existingTeacher.get());
    }

    @Override
    public boolean deleteTeacherById(Long id) {
        if(teacherRepository.existsById(id)){
            teacherRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
