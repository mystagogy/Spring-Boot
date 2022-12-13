package com.example.dtcoin.service;

import com.example.dtcoin.repository.PayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class PayService {

    @Autowired
    PayRepository pr;

    public int insertPoint(HashMap<String, String> params){return pr.insertPoint(params);}

    public double checkBalance(String email){return pr.checkBalance(email);}

}
