package com.jpa.calendar.controller;

import com.jpa.calendar.dto.ScheduleRequest;
import com.jpa.calendar.dto.ScheduleResponse;
import com.jpa.calendar.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleService;

    @GetMapping("/schedules")
    public List<ScheduleResponse> scheduleList(HttpSession session){
        String email = String.valueOf(session.getAttribute("email"));
        return scheduleService.scheduleList(email);
    }

    @DeleteMapping("/schedules/{id}")
    public String deleteSchedule(@PathVariable("id") String id){

        return scheduleService.deleteSchedule(id);
    }

    @PostMapping("/schedules")
    public String insertSchedules(ScheduleRequest scheduleRequest, HttpSession session){
        String email = (String)session.getAttribute("email");
        scheduleRequest.setEmail(email);
        return scheduleService.insertSchedule(scheduleRequest);
    }
}
