package com.example.jpatodo.dto;

import com.example.jpatodo.entity.Todo;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class TodoRes {

    private Long id;
    private String todos;

    public TodoRes(Todo todo){
        this.id = todo.getId();
        this.todos = todo.getTodos();
    }
}
