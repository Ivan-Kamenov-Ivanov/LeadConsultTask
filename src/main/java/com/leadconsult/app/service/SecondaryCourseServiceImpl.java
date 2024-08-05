package com.leadconsult.app.service;

import com.leadconsult.app.api.SecondaryCourseService;
import com.leadconsult.app.models.SecondaryCourse;
import com.leadconsult.app.repo.SecondaryCourseRepository;

import java.util.Optional;

public class SecondaryCourseServiceImpl implements SecondaryCourseService {

    private final SecondaryCourseRepository secondaryCourseRepository;

    public SecondaryCourseServiceImpl(SecondaryCourseRepository secondaryCourseRepository) {
        this.secondaryCourseRepository = secondaryCourseRepository;
    }

    @Override
    public boolean addCourse(SecondaryCourse course) {              //custom Exception handling to be added
        if(secondaryCourseRepository.existsById(course.getId())) {
            return false;
        }
        secondaryCourseRepository.save(course);
        return true;
    }

    @Override
    public boolean deleteCourseById(Long id) {            //custom Exception handling to be added
        if(!secondaryCourseRepository.existsById(id)) {
            return false;
        }
        secondaryCourseRepository.deleteById(id);
        return true;
    }

    @Override
    public SecondaryCourse findCourseById(long id) {                //custom Exception handling to be added
        Optional<SecondaryCourse> result = secondaryCourseRepository.findById(id);
        return result.orElse(null);
    }
}
