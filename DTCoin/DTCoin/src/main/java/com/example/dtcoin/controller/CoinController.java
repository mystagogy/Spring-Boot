package com.example.dtcoin.controller;

import com.example.dtcoin.service.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class CoinController {
    @Autowired
    CoinService cs;

    @PostMapping("/buyCoin")
    public String buyCoin(@RequestParam HashMap<String, String> coin, HttpSession session){
        if(session.getAttribute("email") != null){
            String email = String.valueOf(session.getAttribute("email"));
            coin.put("email", email);
            cs.insertCoin(coin);
            return "구매 완료";
        }
        return "구매 실패";
    }
}
