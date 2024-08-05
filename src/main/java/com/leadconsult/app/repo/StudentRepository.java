package com.leadconsult.app.repo;

import com.leadconsult.app.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
