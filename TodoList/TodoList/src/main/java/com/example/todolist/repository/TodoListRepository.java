package com.example.todolist.repository;

import com.example.todolist.dto.ListDTO;
import com.example.todolist.mapper.TodoListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class TodoListRepository {

    @Autowired
    TodoListMapper tm;

    public int insertTodo(String todo,String user_id){
        return tm.insertTodo(todo,user_id);
    }

    public ArrayList<String> selectTodo(String user_id){
        return tm.selectTodo(user_id);
    }

    public int deleteTodo(String todo){ return tm.deleteTodo(todo);}
}
