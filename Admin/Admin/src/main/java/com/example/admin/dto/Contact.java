package com.example.admin.dto;

public class Contact {

    private int id;

    private String email;

    private String name;

    private String phone;

    private String message;

    private String indate;

    public Contact(){}

    public Contact(int id, String email, String name, String phone, String message, String indate) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.message = message;
        this.indate = indate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }
}
