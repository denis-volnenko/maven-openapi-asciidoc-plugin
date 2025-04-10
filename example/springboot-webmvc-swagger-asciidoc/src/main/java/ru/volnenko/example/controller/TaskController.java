package ru.volnenko.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.volnenko.example.model.TaskDTO;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/v1/task")
public class TaskController {

    @GetMapping(value = "/all", produces = "application/json")
    public List<TaskDTO> selectAllTask() {
        return Collections.emptyList();
    }

}
