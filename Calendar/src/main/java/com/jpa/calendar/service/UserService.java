package com.jpa.calendar.service;

import com.jpa.calendar.dto.UserRequest;

public interface UserService {

    String insertUser(UserRequest userRequest);
    String selectUser(UserRequest userRequest);

}
