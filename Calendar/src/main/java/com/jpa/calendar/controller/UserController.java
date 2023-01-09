package com.jpa.calendar.controller;

import com.jpa.calendar.dto.UserRequest;
import com.jpa.calendar.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.html.HTMLTableCaptionElement;

import javax.servlet.http.HttpSession;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/users")
    public String insertUser(UserRequest userRequest){return userService.insertUser(userRequest);}

    @PostMapping("/login")
    public String login(UserRequest userRequest, HttpSession session){
        String response = userService.selectUser(userRequest);

        if(response.equals("success")){ session.setAttribute("email", userRequest.getEmail());}

        return response;
    }

}
