package com.example.admin.controller;

import com.example.admin.service.IndexService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = {"메인화면 서비스"}, description = "메인화면에 정보 출력 서비스")
public class IndexController {

    @Autowired
    IndexService is;

    @GetMapping("/selectCntMember")
    @ApiOperation(value = "총 사용자 수", notes = "총 사용자 수를 조회한다.")
    public int selectCntMember(){return is.selectCntMember();}

    @GetMapping("/selectAmountPayment")
    @ApiOperation(value = "총 포인트 판매량", notes = "총 포인트 판매량을 조회한다")
    public double selectAmountPayment(){return is.selectAmountPayment();}

    @GetMapping("/selectCntBuy")
    @ApiOperation(value = "총 코인 구매 거래량", notes = "총 코인 거래량을 조회한다.")
    public int selectCntBuy(){return is.selectCntBuy();}

    @GetMapping("/selectCntContact")
    @ApiOperation(value = "총 연락 요청 수", notes = "총 연락 요청 수를 조회한다.")
    public int selectCntContact(){return is.selectCntContact();}

}
