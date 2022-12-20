package com.example.admin.repository;

import com.example.admin.dto.Admin;
import com.example.admin.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminRepository {

    @Autowired
    AdminMapper am;

    public String loginAdmin(Admin admin){return am.loginAdmin(admin);}
}
