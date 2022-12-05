package com.example.todolist.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class PageController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/goSignUp")
    public String signUp(){
        return "signup";
    }

    @GetMapping("/goLogin")
    public String login(){
        return "login";
    }

    @GetMapping("/goTodoList")
    public String todoList(HttpSession session){
        if(session.getAttribute("email")=="")
            return "login";
        return "main";
    }
}
