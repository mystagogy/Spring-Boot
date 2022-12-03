package com.example.todolist.repository;

import com.example.todolist.dto.MemberDTO;
import com.example.todolist.mapper.TodoListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @Autowired
    TodoListMapper mapper;

    public int insertMember(MemberDTO memberDTO){
        return mapper.insertMember(memberDTO);
    }

    public String checkMember(String email){
        return mapper.checkMember(email);
    }

    public MemberDTO loginMember(MemberDTO memberDTO){
        return mapper.loginMember(memberDTO);
    }

}
