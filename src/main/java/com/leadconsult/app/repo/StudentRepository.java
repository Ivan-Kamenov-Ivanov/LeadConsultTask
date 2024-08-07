package com.leadconsult.app.repo;

import com.leadconsult.app.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT s FROM Student s JOIN s.courses c WHERE c.id = :courseId")
    List<Student> findAllStudentsByCourseId(@Param("courseId") Long courseId);

    @Query("SELECT s FROM Student s JOIN s.groups g WHERE g.id = :groupId")
    List<Student> findAllStudentsByGroupId(@Param("groupId") Long groupId);

    @Query("SELECT s FROM Student s JOIN s.courses c JOIN s.groups g WHERE c.id = :courseId AND g.id = :groupId")
    List<Student> findAllStudentsByCourseIdAndGroupId(@Param("courseId") Long courseId, @Param("groupId") Long groupId);

    @Query("SELECT s FROM Student s JOIN s.courses c WHERE s.age > :age AND c.id = :courseId")
    List<Student> findOlderByAgeAndCourseId(@Param("age") int age, @Param("courseId") Long courseId);
}
