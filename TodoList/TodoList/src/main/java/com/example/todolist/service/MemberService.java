package com.example.todolist.service;

import com.example.todolist.dto.MemberDTO;
import com.example.todolist.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    MemberRepository mr;

    public int insertMember(MemberDTO memberDTO){
        return mr.insertMember(memberDTO);
    }

    public String checkMember(String email){
        return mr.checkMember(email);
    }

    public MemberDTO loginMember(MemberDTO memberDTO){
        return mr.loginMember(memberDTO);
    }
}
