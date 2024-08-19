package com.leadconsult.app.repo;

import com.leadconsult.app.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByCourses_Id(long courseId);

    List<Student> findByGroups_Id(long groupId);

    List<Student> findByCourses_IdAndGroups_Id(long courseId, long groupId);

    List<Student> findByAgeGreaterThanAndCourses_Id(int age, long courseId);
}
