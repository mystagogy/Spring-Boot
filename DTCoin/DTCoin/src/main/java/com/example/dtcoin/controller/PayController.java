package com.example.dtcoin.controller;

import com.example.dtcoin.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class PayController {

    @Autowired
    PayService ps;

    @GetMapping("/point")
    public String insertPoint(@RequestParam HashMap<String, String>params, HttpSession session){
        if(session.getAttribute("email")!=null){
            String email=String.valueOf(session.getAttribute("email"));
            params.put("email",email);
            ps.insertPoint(params);
        }
        else{
            return "로그인 해주세요.";
        }
        return "충전을 완료하였습니다.";
    }

}
