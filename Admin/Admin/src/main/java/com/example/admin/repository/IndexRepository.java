package com.example.admin.repository;

import com.example.admin.mapper.IndexMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class IndexRepository {

    @Autowired
    IndexMapper im;

    public int selectCntMember(){return im.selectCntMember();}

    public double selectAmountPayment(){return im.selectAmountPayment();}

    public int selectCntBuy(){return im.selectCntBuy();}

    public int selectCntContact(){return im.selectCntContact();}
}
