package com.example.todolist.mapper;

import com.example.todolist.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TodoListMapper {

    public int insertMember(MemberDTO memberDTO);

    public String checkMember(String email);

    public MemberDTO loginMember(MemberDTO memberDTO);
}
