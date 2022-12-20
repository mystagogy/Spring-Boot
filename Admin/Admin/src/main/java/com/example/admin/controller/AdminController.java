package com.example.admin.controller;

import com.example.admin.dto.Admin;
import com.example.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class AdminController {

    @Autowired
    AdminService as;

    @PostMapping("/login")
    public String login(Admin admin, HttpSession session){
        if(as.loginAdmin(admin)!=null){
            session.setAttribute("id", admin.getId());
            return "index";
        }
        return "redirect:/";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("id");
        return "redirect:/";
    }
}
