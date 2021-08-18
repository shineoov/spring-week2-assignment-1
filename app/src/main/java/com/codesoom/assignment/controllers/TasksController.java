package com.codesoom.assignment.controllers;

import com.codesoom.assignment.TaskManager;
import com.codesoom.assignment.models.Task;
import java.util.Collection;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * 할일에 대한 처리를 하는 컨트롤러.
 *
 * @author  pangnem
 * @see RestController
 * @see RequestMapping
 */
@RestController
@RequestMapping("/tasks")
@CrossOrigin
public class TasksController {

    private final TaskManager taskManager = TaskManager.getInstance();

    @GetMapping
    public Collection<Task> get() {
        return taskManager.getAllTasks();
    }

    @GetMapping("{id}")
    public Task getOne(@PathVariable Long id) {
        return taskManager.getTaskWith(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Task post(@RequestBody Task task) {
        return taskManager.createTask(task);
    }

    @PutMapping ("{id}")
    @PatchMapping("{id}")
    public Task update(@PathVariable Long id, @RequestBody Task task) {
        return taskManager.updateTask(id, task);
    }
}
