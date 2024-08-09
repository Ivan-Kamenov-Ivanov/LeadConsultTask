package com.leadconsult.app.service;

import com.leadconsult.app.api.CourseService;
import com.leadconsult.app.models.Course;
import com.leadconsult.app.repo.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository mainCourseRepository) {
        this.courseRepository = mainCourseRepository;
    }

    @Override
    public Course addCourse(Course course) {
        try {
            return courseRepository.save(course);
        } catch (IllegalArgumentException e){
            throw new IllegalArgumentException("Invalid data", e);
        }
    }

    @Override
    public Course findCourseById(long id) {
        Optional<Course> result = courseRepository.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<Course> findAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public boolean deleteCourseById(long id) {
        if (courseRepository.existsById(id)) {
            courseRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
