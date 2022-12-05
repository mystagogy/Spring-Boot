package com.example.todolist.dto;

public class ListDTO {

    private int id;
    private String todo;
    private String indate;
    private String user_id;

    public ListDTO(int id, String todo, String indate, String user_id) {
        this.id = id;
        this.todo = todo;
        this.indate = indate;
        this.user_id = user_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

}
