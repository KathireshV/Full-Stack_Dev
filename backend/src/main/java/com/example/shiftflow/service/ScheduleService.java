package com.example.shiftflow.service;

import com.example.shiftflow.model.Schedule;
import com.example.shiftflow.repo.ScheduleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {

    @Autowired
    private ScheduleRepo scheduleRepo;

    public Schedule createSchedule(Schedule schedule) {
        return scheduleRepo.save(schedule);
    }

    public List<Schedule> viewSchedule(Long userId) {
        return scheduleRepo.findByStaffId(userId);
    }
}
