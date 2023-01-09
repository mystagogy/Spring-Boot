package com.jpa.calendar.service;

import com.jpa.calendar.dto.ScheduleRequest;
import com.jpa.calendar.dto.ScheduleResponse;

import java.util.List;

public interface ScheduleService {

    List<ScheduleResponse> scheduleList(String email);
    String deleteSchedule(String id);
    String insertSchedule(ScheduleRequest scheduleRequest);

}
