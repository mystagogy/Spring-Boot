package com.example.todolist.mapper;


import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;


@Mapper
public interface TodoListMapper {

    public int insertTodo(String todo, String user_id);

    public ArrayList<String> selectTodo(String user_id);

    public int deleteTodo(String todo);
}
