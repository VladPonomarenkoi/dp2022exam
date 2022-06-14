package com.exam.exam.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.exam.entities.Table7;
import com.exam.exam.services.Table7Service;

@RestController
public class HomeController {
    @Autowired
    Table7Service table7Service;

    @GetMapping("/getAll") 
    public List<Table7> getAll(){
        return  table7Service.getTable7All();
    }

    @GetMapping("/getOne/{id}") 
    public Table7 getById(@PathVariable Long id){
        return table7Service.getTable7ById(id);
    }

    @PostMapping("/saveOne")
    public Table7 saveOne(@RequestBody Table7 table){
        return table7Service.saveOne(table);
    }

    @PatchMapping("/updateOne/{id}") 
    public Table7 updateById(@PathVariable Long id, @RequestBody Table7 table){
        return table7Service.updateTable7ById(id, table);
    }

    @DeleteMapping("/deleteOne/{id}") 
    public Table7 deleteById(@PathVariable Long id){
        return table7Service.deleteTable7ById(id);
    }

}
