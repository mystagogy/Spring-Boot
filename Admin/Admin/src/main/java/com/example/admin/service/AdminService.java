package com.example.admin.service;

import com.example.admin.dto.Admin;
import com.example.admin.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    AdminRepository ar;

    public String loginAdmin(Admin admin){return  ar.loginAdmin(admin);}
}
