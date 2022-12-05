package com.example.todolist.controller;

import com.example.todolist.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@RestController
public class TodoListController {

    @Autowired
    TodoListService ts;

    @GetMapping("/list")
    public ArrayList<String> displayList(HttpSession session){
        return ts.selectTodo((String)session.getAttribute("email"));
    }

    @GetMapping("/receiveList")
    public ArrayList<String> insertList(String todo ,HttpSession session){
        ArrayList<String>list = ts.selectTodo((String)session.getAttribute("email"));
        if(!list.contains(todo)){
            ts.insertTodo(todo,(String)session.getAttribute("email"));
        }

        return displayList(session);
    }

    @GetMapping("/deleteList")
    public ArrayList<String> deleteList(String todo,HttpSession session){
        int id = Integer.parseInt(todo);
        ts.deleteTodo(ts.selectTodo((String)session.getAttribute("email")).get(id));
        return ts.selectTodo((String)session.getAttribute("email"));
    }

}
