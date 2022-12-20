package com.example.admin.dto;

public class Member {

    private String email = "";
    private String name = "";
    private String phone = "";
    private String address = "";
    private String detail = "";
    private String indate = "";

    public Member(){}

    public Member(String email, String name, String phone, String address, String detail, String indate) {
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.detail = detail;
        this.indate = indate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }
}
