package com.example.admin.controller;

import com.example.admin.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    IndexService is;

    @GetMapping("/selectCntMember")
    public int selectCntMember(){return is.selectCntMember();}

    @GetMapping("/selectAmountPayment")
    public double selectAmountPayment(){return is.selectAmountPayment();}

    @GetMapping("/selectCntBuy")
    public int selectCntBuy(){return is.selectCntBuy();}

    @GetMapping("/selectCntContact")
    public int selectCntContact(){return is.selectCntContact();}

}
