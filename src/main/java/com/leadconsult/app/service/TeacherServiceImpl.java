package com.leadconsult.app.service;

import com.leadconsult.app.api.TeacherService;
import com.leadconsult.app.models.Student;
import com.leadconsult.app.models.Teacher;
import com.leadconsult.app.repo.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public boolean addTeacher(Teacher teacher) {                //custom Exception handling to be added
        if(teacherRepository.existsById(teacher.getId())){
            return false;
        }
        teacherRepository.save(teacher);
        return true;
    }

    @Override
    public boolean deleteTeacherById(Long id) {             //custom Exception handling to be added
        if(!teacherRepository.existsById(id)){
            return false;
        }
        teacherRepository.deleteById(id);
        return true;
    }

    @Override
    public Teacher findTeacherById(Long id) {                   //custom Exception handling to be added
        Optional<Teacher> result = teacherRepository.findById(id);
        return result.orElse(null);
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
}
