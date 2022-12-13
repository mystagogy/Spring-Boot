package com.example.dtcoin.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface PayMapper {

    public int insertPoint(HashMap<String, String>params);

}
