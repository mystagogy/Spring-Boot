package com.jpa.calendar.dto;

import com.jpa.calendar.entity.Schedule;
import com.jpa.calendar.entity.User;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ScheduleRequest {

    private String title;
    private String email;
    private String date;

    public Schedule toEntity(){

        return Schedule.builder()
                .user(User.builder().email(this.email).build())
                .title(this.title)
                .date(this.date)
                .build();
    }
}
