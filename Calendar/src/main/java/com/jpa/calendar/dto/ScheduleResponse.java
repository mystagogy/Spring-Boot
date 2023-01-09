package com.jpa.calendar.dto;

import com.jpa.calendar.entity.Schedule;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ScheduleResponse {

    private String id;
    private String title;
    private String date;

    public ScheduleResponse(Schedule schedule){

        this.id = String.valueOf(schedule.getId());
        this.title = schedule.getTitle();
        this.date = schedule.getDate();

    }

}
