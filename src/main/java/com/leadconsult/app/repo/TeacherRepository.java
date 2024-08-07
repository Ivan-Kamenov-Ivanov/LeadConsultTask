package com.leadconsult.app.repo;

import com.leadconsult.app.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    @Query("SELECT t FROM Teacher t JOIN t.courses c JOIN t.groups g WHERE c.id = :courseId AND g.id = :groupId")
    List<Teacher> findAllTeachersByCourseAndGroupId(@Param("courseId") Long courseId, @Param("groupId") Long groupId);
}
