package com.leadconsult.app.service;

import com.leadconsult.app.api.MainCourseService;
import com.leadconsult.app.models.MainCourse;
import com.leadconsult.app.repo.MainCourseRepository;

import java.util.Optional;

public class MainCourseServiceImpl implements MainCourseService {

    private final MainCourseRepository mainCourseRepository;

    public MainCourseServiceImpl(MainCourseRepository mainCourseRepository) {
        this.mainCourseRepository = mainCourseRepository;
    }

    @Override
    public boolean addCourse(MainCourse course) {               //custom Exception handling to be added
        if (mainCourseRepository.existsById(course.getId())) {
            return false;
        }
        mainCourseRepository.save(course);
        return true;
    }

    @Override
    public boolean deleteCourseById(long id) {            //custom Exception handling to be added
        if (!mainCourseRepository.existsById(id)) {
            return false;
        }
        mainCourseRepository.deleteById(id);
        return true;
    }

    @Override
    public MainCourse findCourseById(long id) {             //custom Exception handling to be added
        Optional<MainCourse> result = mainCourseRepository.findById(id);
        return result.orElse(null);
    }
}
