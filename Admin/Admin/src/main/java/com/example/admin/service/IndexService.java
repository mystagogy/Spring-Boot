package com.example.admin.service;

import com.example.admin.repository.IndexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexService {

    @Autowired
    IndexRepository ir;

    public int selectCntMember(){return ir.selectCntMember();}

    public double selectAmountPayment(){return ir.selectAmountPayment();}

    public int selectCntBuy(){return ir.selectCntBuy();}

    public int selectCntContact(){return ir.selectCntContact();}
}
