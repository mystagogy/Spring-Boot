package com.example.admin.service;

import com.example.admin.dto.*;
import com.example.admin.repository.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ListService {

    @Autowired
    ListRepository lr;

    public ArrayList<Member> selectMember(){return lr.selectMember();}

    public ArrayList<Payment> selectPayment(){return lr.selectPayment();}

    public ArrayList<Buy> selectBuy(){return lr.selectBuy();}

    public ArrayList<Contact> selectContact(){return lr.selectContact();}

    public ArrayList<Subscribe> selectSubscribe(){return lr.selectSubscribe();}
}
