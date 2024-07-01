package com.example.school.repository;

import com.example.school.repository.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface SchoolRepository extends JpaRepository<School, Long> {

    @Modifying
    @Transactional
    @Query("UPDATE School s SET s.studentsCount = s.studentsCount + 1 WHERE s.id = :schoolId")
    void updateStudentsCount(Long schoolId);
}
