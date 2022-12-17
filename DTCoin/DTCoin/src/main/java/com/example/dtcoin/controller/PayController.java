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
        String email=String.valueOf(session.getAttribute("email"));
        params.put("email",email);
        ps.insertPoint(params);
        return "충전을 완료하였습니다.";
    }

    @GetMapping("/checkBalance")
    public String checkBalance(String total, HttpSession session){
        String email = String.valueOf(session.getAttribute("email"));
        double balance = ps.checkBalance(email);
        double amount = Double.valueOf(total);
        if(balance - amount > 0){
            return "can";
        }
        else{
            return "cannot";
        }
    }

    @GetMapping("/pointList")
    public ArrayList<HashMap<String,Object>> pointList(HttpSession session){
        String email = String.valueOf(session.getAttribute("email"));
        return ps.selectPoint(email);
    }

}
