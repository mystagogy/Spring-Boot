package com.example.dtcoin.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface CoinMapper {

    public int insertCoin(HashMap<String, String>params);
}
