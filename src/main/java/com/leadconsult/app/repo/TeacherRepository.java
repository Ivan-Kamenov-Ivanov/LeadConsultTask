package com.leadconsult.app.repo;

import com.leadconsult.app.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    List<Teacher> findByCourses_IdAndGroups_Id(long coursesId, long groupId);
}
