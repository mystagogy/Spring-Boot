package com.example.admin.repository;

import com.example.admin.dto.*;
import com.example.admin.mapper.ListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ListRepository {

    @Autowired
    ListMapper lm;

    public ArrayList<Member> selectMember(){return lm.selectMember();}

    public ArrayList<Payment> selectPayment(){return lm.selectPayment();}

    public ArrayList<Buy> selectBuy(){return lm.selectBuy();}

    public ArrayList<Contact> selectContact(){return lm.selectContact();}

    public ArrayList<Subscribe> selectSubscribe(){ return lm.selectSubscribe();}
}
