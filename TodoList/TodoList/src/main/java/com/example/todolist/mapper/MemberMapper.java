package com.example.todolist.mapper;

import com.example.todolist.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    public int insertMember(MemberDTO memberDTO);

    public String checkMember(String email);

    public MemberDTO loginMember(String email, String password);
}
