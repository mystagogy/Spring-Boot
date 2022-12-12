package com.example.dtcoin.controller;

import com.example.dtcoin.dto.Member;
import com.example.dtcoin.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;


@Controller
public class MemberController {

    @Autowired
    MemberService ms;

    @PostMapping("/signup")
    public String insertMember(Member member){
        if(ms.checkMember(member.getEmail()).equals(member.getEmail()) &&ms.insertMember(member)>0){
            return "login";
        }
        return "signup";
    }

    @PostMapping("/login")
    public String login(String email, String password, HttpSession session){
        if(ms.loginMember(email,password)!=null){
            session.setAttribute("email", email);
            return "index";
        }
        return "signup";
    }


}
