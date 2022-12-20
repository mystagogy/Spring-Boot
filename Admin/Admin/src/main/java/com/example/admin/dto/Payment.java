package com.example.admin.dto;

public class Payment {

    private int id;

    private String email;

    private int amount;

    private String uid;

    private String indate;

    public Payment() {}

    public Payment(int id, String email, int amount, String uid, String indate) {
        this.id = id;
        this.email = email;
        this.amount = amount;
        this.uid = uid;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }
}
