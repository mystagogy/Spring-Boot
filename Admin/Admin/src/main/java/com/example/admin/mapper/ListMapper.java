package com.example.admin.mapper;

import com.example.admin.dto.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface ListMapper {

    public ArrayList<Member> selectMember();

    public ArrayList<Payment> selectPayment();

    public ArrayList<Buy> selectBuy();

    public ArrayList<Contact> selectContact();

    public ArrayList<Subscribe> selectSubscribe();
}
