package com.example.admin.controller;

import com.example.admin.dto.*;
import com.example.admin.service.ListService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@Api(tags = {"목록 출력 서비스"}, description = "선택 정보 목록 출력 서비스")
public class ListController {

    @Autowired
    ListService ls;

    @GetMapping("/selectMember")
    @ApiOperation(value = "사용자 목록", notes = "모든 사용자 정보를 출력한다.")
    public ArrayList<Member> selectMember(){return ls.selectMember();}

    @GetMapping("/selectPayment")
    @ApiOperation(value = "포인트 충전 목록", notes = "모든 포인트 충전 이력을 출력한다.")
    public ArrayList<Payment> selectPayment(){return ls.selectPayment();}

    @GetMapping("/selectBuy")
    @ApiOperation(value = "코인 구매 목록", notes = "모든 코인 구매 이력을 출력한다.")
    public ArrayList<Buy> selectBuy(){return ls.selectBuy();}

    @GetMapping("/selectContact")
    @ApiOperation(value = "연락 요청 목록", notes = "모든 연락 요청 목록을 출력한다.")
    public ArrayList<Contact> selectContact(){return ls.selectContact();}

    @GetMapping("/selectSubscribe")
    @ApiOperation(value = "구독 목록", notes = "모든 구독 목록을 출력한다.")
    public ArrayList<Subscribe> selectSubscribe(){return ls.selectSubscribe();}

}
