package com.example.dtcoin.repository;

import com.example.dtcoin.dto.Member;
import com.example.dtcoin.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class MemberRepository {

    @Autowired
    MemberMapper mm;

    public int insertMember(Member member){ return mm.insertMember(member);}

    public String checkMember(String email){ return mm.checkMember(email);}

    public Member loginMember(String email, String password) { return mm.loginMember(email,password);}
}
