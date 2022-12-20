package com.example.admin.mapper;

import com.example.admin.dto.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {

    public String loginAdmin(Admin admin);
}
