package com.example.jpatodo.service.Impl;

import com.example.jpatodo.dto.TodoRes;
import com.example.jpatodo.entity.Todo;
import com.example.jpatodo.repository.TodoRepository;
import com.example.jpatodo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;

    @Override
    public List<TodoRes> todoList() {
        return todoRepository.findAll().stream()
                .map(entity-> new TodoRes(entity))
                .collect(Collectors.toList());
    }

    @Override
    public String deleteTodo(String id) {
        try{
            todoRepository.deleteById(Long.valueOf(id));
        }catch (Exception e){
            return "fail";
        }
        return "success";
    }

    @Override
    public String insertTodo(String todo) {
        try{
            todoRepository.save(Todo.builder().todos(todo).build());
        }catch (Exception e){
            return "fail";
        }
        return "success";
    }
}
