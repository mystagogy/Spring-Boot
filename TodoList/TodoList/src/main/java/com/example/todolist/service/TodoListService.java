package com.example.todolist.service;

import com.example.todolist.dto.ListDTO;
import com.example.todolist.repository.TodoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class TodoListService {

    @Autowired
    TodoListRepository tr;

    public int insertTodo(String todo,String user_id){
        return tr.insertTodo(todo,user_id);
    }

    public ArrayList<String> selectTodo(String user_id){
        return tr.selectTodo(user_id);
    }

    public int deleteTodo(String todo){return tr.deleteTodo(todo);}
}
