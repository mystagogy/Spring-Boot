package com.example.admin.controller;

import com.example.admin.dto.*;
import com.example.admin.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ListController {

    @Autowired
    ListService ls;

    @GetMapping("/selectMember")
    public ArrayList<Member> selectMember(){return ls.selectMember();}

    @GetMapping("/selectPayment")
    public ArrayList<Payment> selectPayment(){return ls.selectPayment();}

    @GetMapping("/selectBuy")
    public ArrayList<Buy> selectBuy(){return ls.selectBuy();}

    @GetMapping("/selectContact")
    public ArrayList<Contact> selectContact(){return ls.selectContact();}

    @GetMapping("/selectSubscribe")
    public ArrayList<Subscribe> selectSubscribe(){return ls.selectSubscribe();}

}
