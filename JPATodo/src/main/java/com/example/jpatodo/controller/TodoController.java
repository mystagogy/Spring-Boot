package com.example.jpatodo.controller;

import com.example.jpatodo.dto.TodoRes;
import com.example.jpatodo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;


    @GetMapping("/todos")
    public List<TodoRes> todoList() {
        return todoService.todoList();
    }

    @DeleteMapping("/todos/{id}")
    public String deleteTodo(@PathVariable("id") String id) {
        return todoService.deleteTodo(id);
    }

    @PostMapping("/todos")
    public String insertTodo(String todos) {
        System.out.println(todos);
        return todoService.insertTodo(todos);
    }
}
