package com.example.demo.web.controller;

import com.example.demo.business.entities.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TodoComponent {
    @GetMapping("/todos")
    public String todoList(Model model) {
        List<Todo> todos = new ArrayList<>();
        todos.add(new Todo(1, "Buy milk"));
        todos.add(new Todo(2, "Learn something"));
        model.addAttribute("todos", todos);
        return "todos";
    }
}
