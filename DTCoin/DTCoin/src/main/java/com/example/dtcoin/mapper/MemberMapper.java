package com.example.dtcoin.mapper;

import com.example.dtcoin.dto.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    public int insertMember(Member member);

    public String checkMember(String email);

    public Member loginMember(String email, String password);
}
