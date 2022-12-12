package com.example.dtcoin.service;

import com.example.dtcoin.dto.Member;
import com.example.dtcoin.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    MemberRepository mr;

    public int insertMember(Member member){ return mr.insertMember(member);}

    public String checkMember(String email){ return mr.checkMember(email);}

    public Member loginMember(String email, String password){ return mr.loginMember(email,password);}
}
