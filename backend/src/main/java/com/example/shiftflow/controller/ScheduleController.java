package com.example.shiftflow.controller;

import com.example.shiftflow.model.Schedule;
import com.example.shiftflow.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schedule")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @PostMapping("/create")
    public Schedule createSchedule(@RequestBody Schedule schedule) {
        return scheduleService.createSchedule(schedule);
    }

    @GetMapping("/view/{userId}")
    public List<Schedule> viewSchedule(@PathVariable Long userId) {
        return scheduleService.viewSchedule(userId);
    }
}
