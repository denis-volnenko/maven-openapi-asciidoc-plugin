package ru.volnenko.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import ru.volnenko.example.model.ProjectDTO;
import ru.volnenko.example.model.ResultRecord;

import java.util.Collections;
import java.util.List;

@RestController
@Api(tags = {"Проект"})
@RequestMapping("/api/v1/project")
public class ProjectController {

    @ApiOperation("Получение всех проектов")
    @GetMapping(value = "/all", produces = "application/json")
    public List<ProjectDTO> selectAllProject() {
        return Collections.emptyList();
    }

    @ApiOperation("Получение проекта по Id")
    @GetMapping(value = "/one/{id}")
    public ProjectDTO selectOneProject(
            @ApiParam("Идентификатор")
            @PathVariable("id") String id
    ) {
        return new ProjectDTO();
    }

    @ApiOperation("Создание нового проекта")
    @PostMapping(value = "/one/{id}")
    public ResultRecord createOneTask(
            @ApiParam("Идентификатор")
            @PathVariable("id") String id,
            @RequestBody ProjectDTO projectDTO
    ) {
        return new ResultRecord();
    }

}
