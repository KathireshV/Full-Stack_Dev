package com.example.shiftflow.repo;

import com.example.shiftflow.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleRepo extends JpaRepository<Schedule, Long> {
    List<Schedule> findByStaffId(Long staffId);
}
