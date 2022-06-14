package com.exam.exam.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.exam.entities.Table7;
import com.exam.exam.repositories.Table7Repository;

@Service
public class Table7Service {
    @Autowired Table7Repository table7Repository;

    public Table7Service() {

    }

    public List<Table7> getTable7All() {
        return table7Repository.findAll();
    }

    public Table7 saveOne(Table7 table) {
        return table7Repository.save(table);
    }

    public Table7 getTable7ById(Long id) {
        try{
            return table7Repository.findById(id).orElseThrow(() -> new Exception("Not found"));
        }
        catch(Exception e){
            return null;
        }
    }

    public Table7 deleteTable7ById(Long id) {
        try{
            Table7 table7 = table7Repository.findById(id).orElseThrow(() -> new Exception("Not found"));
            table7Repository.deleteById(id);

            return table7;
        }
        catch(Exception e){
            return null;
        }

    }

    public Table7 updateTable7ById(Long id, Table7 table) {
        try{
            Table7 table7 = table7Repository.findById(id).orElseThrow(() -> new Exception("Not found"));
            String a = table.getTitle10() == null ? table7.getTitle10() : table.getTitle10();
            Short  b = table.getHight() == null ? table7.getHight() : table.getHight();
            table7.setTitle10(a);
            table7.setHight(b);

            return table7Repository.save(table7);
        }
        catch(Exception e){
            return null;
        }
    }
}
