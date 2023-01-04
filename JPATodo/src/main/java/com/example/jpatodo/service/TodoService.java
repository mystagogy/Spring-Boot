package com.example.jpatodo.service;

import com.example.jpatodo.dto.TodoRes;


import java.util.List;

public interface TodoService {

    List<TodoRes> todoList();
    String deleteTodo(String id);
    String insertTodo(String todo);

}
