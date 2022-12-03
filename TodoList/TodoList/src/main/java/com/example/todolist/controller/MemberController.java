package com.example.todolist.controller;

import com.example.todolist.dto.MemberDTO;
import com.example.todolist.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class MemberController {

    @Autowired
    MemberService ms;

    @PostMapping("/signup")
    public String signup(MemberDTO memberDTO){
        if(ms.checkMember(memberDTO.getEmail()).equals(memberDTO.getEmail()) || ms.insertMember(memberDTO) > 0){
            return "login";
        }
        return "index";
    }

    @PostMapping("/login")
    public String login(MemberDTO memberDTO, HttpSession session){

        MemberDTO loginMember = ms.loginMember(memberDTO);

        if(loginMember.getEmail().equals("")||loginMember.getPassword().equals("")){
            return "login";
        }

        if(loginMember.getEmail().equals(memberDTO.getEmail())||
                loginMember.getPassword().equals(memberDTO.getPassword())){
            session.setAttribute("email", loginMember.getEmail());
            return "index";
        }

        return "login";
    }
}
