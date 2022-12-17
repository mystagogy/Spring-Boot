package com.example.dtcoin.service;

import com.example.dtcoin.repository.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class CoinService {

    @Autowired
    CoinRepository cr;

    public int insertCoin(HashMap<String, String> params){return cr.insertCoin(params);}

    public ArrayList<HashMap<String ,Object>> selectCoin(String email){return cr.selectCoin(email);}
}
