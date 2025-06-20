package com.sohamsur.todo.controller;

import com.sohamsur.todo.models.DailyItem;
import com.sohamsur.todo.service.DailyActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DailyActivityController {

    @Autowired
    DailyActivityService dailyActivityService;

    @GetMapping("/getDailyTasks")
    public ResponseEntity<List<DailyItem>> getDailyTasks() {
        return new ResponseEntity<>(dailyActivityService.getToDoList(), HttpStatus.OK);
    }

    @PostMapping("/createDailyTask")
    public  ResponseEntity<Object> createDailyTasks(@RequestBody DailyItem task) {
        List<DailyItem> updatedList = dailyActivityService.addToDoList(new DailyItem((getDailyTasks().getBody().size()+1), task.getItem(), task.getDesc()));

        Map<String, String> addDailyTaskResponse = new HashMap<String, String>() {{
            put("taskItems", Integer.toString(updatedList.size()));
            put("createdTime", LocalTime.now().toString());
        }};

        return new ResponseEntity<>(addDailyTaskResponse,HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteDailyTask")
    public String deleteDailyTasks() {
        return "Daily Task deleted";
    }


}
