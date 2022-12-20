package com.example.admin.controller;

import com.example.admin.dto.Admin;
import com.example.admin.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpSession;

@Controller
@Api(tags = {"관리자 로그인 서비스"}, description = "관리자 로그인 관련 서비스")
public class AdminController {

    @Autowired
    AdminService as;

    @PostMapping("/login")
    @ApiOperation(value = "사용자별 인증 정보 CHECK", notes = "인증된 사용자인지 판단하는 API입니다.")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "사용자 식별 ID", required = true),
            @ApiImplicitParam(name = "password", value = "사용자 비밀번호", required = true)
    })
    public String login(Admin admin, @ApiIgnore HttpSession session){
        if(as.loginAdmin(admin)!=null){
            session.setAttribute("id", admin.getId());
            return "index";
        }
        return "redirect:/";
    }

    @GetMapping("/logout")
    @ApiOperation(value = "사용자 인증 정보 초기화", notes = "사용자 인증정보를 초기화하는 API입니다.")
    public String logout(@ApiIgnore HttpSession session){
        session.removeAttribute("id");
        return "redirect:/";
    }
}
