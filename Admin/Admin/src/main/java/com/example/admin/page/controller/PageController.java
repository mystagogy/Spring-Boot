package com.example.admin.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String login(){return "login";}

    @GetMapping("/index")
    public String index(){return "index";}

    @GetMapping("/goMember")
    public String goMember(){return "memberList";}

    @GetMapping("/goPayment")
    public String goPayment(){return "paymentList";}

    @GetMapping("/goBuy")
    public String goBuy(){return "buyList";}

    @GetMapping("/goContact")
    public String lgoContact(){return "contactList";}

    @GetMapping("/goSubscribe")
    public String goSubscribe(){return "subscribeList";}
}
