package com.example.dtcoin.repository;

import com.example.dtcoin.mapper.PayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class PayRepository {

    @Autowired
    PayMapper pm;

    public int insertPoint(HashMap<String, String> params){return pm.insertPoint(params);}

    public double checkBalance(String email){return pm.checkBalance(email);}

    public ArrayList<HashMap<String,Object>> selectPoint(String email){return pm.selectPoint(email);}

}
