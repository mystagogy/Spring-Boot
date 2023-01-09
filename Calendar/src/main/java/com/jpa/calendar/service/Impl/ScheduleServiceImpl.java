package com.jpa.calendar.service.Impl;

import com.jpa.calendar.dto.ScheduleRequest;
import com.jpa.calendar.dto.ScheduleResponse;
import com.jpa.calendar.entity.User;
import com.jpa.calendar.repository.ScheduleRepository;
import com.jpa.calendar.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ScheduleServiceImpl implements ScheduleService {

    private final ScheduleRepository scheduleRepository;

    @Override
    public List<ScheduleResponse> scheduleList(String email) {
        return scheduleRepository.findByUser(User.builder()
                        .email(email).build()).stream()
                        .map(schedule -> new ScheduleResponse(schedule))
                        .collect(Collectors.toList());
    }

    @Override
    public String deleteSchedule(String id) {
        try {
            scheduleRepository.deleteById(Long.valueOf(id));
        }catch (Exception e){
            return "fail";
        }
        return "success";
    }

    @Override
    public String insertSchedule(ScheduleRequest scheduleRequest) {
        try{
            scheduleRepository.save(scheduleRequest.toEntity());
        }catch (Exception e){
            return "fail";
        }
        return "success";
    }
}
