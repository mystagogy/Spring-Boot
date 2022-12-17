package com.example.dtcoin.repository;

import com.example.dtcoin.mapper.CoinMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class CoinRepository {
    @Autowired
    CoinMapper cm;

    public int insertCoin(HashMap<String, String> params){return cm.insertCoin(params);}

    public ArrayList<HashMap<String ,Object>> selectCoin(String email){return cm.selectCoin(email);}
}
