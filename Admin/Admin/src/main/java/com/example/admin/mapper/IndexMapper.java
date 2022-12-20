package com.example.admin.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IndexMapper {

    public int selectCntMember();

    public double selectAmountPayment();

    public int selectCntBuy();

    public int selectCntContact();
}
