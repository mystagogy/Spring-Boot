package com.example.admin.page.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Api(tags = {"화면 출력 서비스"}, description = "선택 화면 출력 서비스")
public class PageController {

    @GetMapping("/")
    @ApiOperation(value = "로그인 화면", notes = "로그인 화면을 출력한다.")
    public String login(){return "login";}

    @GetMapping("/index")
    @ApiOperation(value = "기본 화면", notes = "로그인 후 이동하는 기본 화면으로 이동한다.")
    public String index(){return "index";}

    @GetMapping("/goMember")
    @ApiOperation(value = "사용자 목록 화면", notes = "사용자 목록을 출력하는 화면으로 이동한다.")
    public String goMember(){return "memberList";}

    @GetMapping("/goPayment")
    @ApiOperation(value = "포인트 충전 목록 화면", notes = "포인트 충전 목록을 출력하는 화면으로 이동한다.")
    public String goPayment(){return "paymentList";}

    @GetMapping("/goBuy")
    @ApiOperation(value = "코인 구매 이력 화면", notes = "코인 구매 이력을 출력하는 화면으로 이동한다.")
    public String goBuy(){return "buyList";}

    @GetMapping("/goContact")
    @ApiOperation(value = "연락 요청 목록 화면", notes = "연락 요청 목록울 출력하는 화면으로 이동한다.")
    public String lgoContact(){return "contactList";}

    @GetMapping("/goSubscribe")
    @ApiOperation(value = "구독 목록 화면", notes = "구독자 목록을 출력하는 화면으로 이동한다.")
    public String goSubscribe(){return "subscribeList";}
}
