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
    public Teacher addTeacher(Teacher teacher) {                //custom Exception handling to be added
        if(teacherRepository.existsById(teacher.getId())){
            return teacherRepository.save(teacher);
        }
        return null;
    }

    @Override
    public List<Teacher> findAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher findTeacherById(Long id) {                   //custom Exception handling to be added
        Optional<Teacher> result = teacherRepository.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<Teacher> findAllTeachersByCourseAndGroupId(Long courseId, Long groupId) {
        return teacherRepository.findAllTeachersByCourseAndGroupId(courseId, groupId);
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) {             //custom Exception handling to be added
        Optional<Teacher> existingTeacher = teacherRepository.findById(teacher.getId());
        if(existingTeacher.isEmpty()){
            return null;
        }
        existingTeacher.get().setName(teacher.getName());
        existingTeacher.get().setAge(teacher.getAge());
        return teacherRepository.save(existingTeacher.get());
    }

    @Override
    public void deleteTeacherById(Long id) {             //custom Exception handling to be added
        if(!teacherRepository.existsById(id)){
            teacherRepository.deleteById(id);
        }
    }
}
