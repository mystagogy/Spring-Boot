package com.jpa.calendar.repository;

import com.jpa.calendar.entity.Schedule;
import com.jpa.calendar.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    List<Schedule> findByUser(User user);
}
