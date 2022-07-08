package com.bismu.suza.notifiacation.controller;

import org.hibernate.engine.spi.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bismu.suza.notifiacation.model.Student;
import com.bismu.suza.notifiacation.repository.Studentrepository;


@RestController
public class Studentcontroller<student> {
    @Autowired
 private Studentrepository repository;


    @GetMapping("/")
    public String showIndexPage() {
        return "bisara";
    }


    @GetMapping("/Student")
    public java.util.List<Student> getAll(){
        return repository.findAll();
    }

    
    @PostMapping("/addStudent")
    public Student newStudent(@RequestBody Student newStudent){
        return repository.save(newStudent);
    }


    @DeleteMapping("Student/{id}")
    public void deleteStudent(@PathVariable int id){
        repository.deleteById(id);
    }
 

}






    
    

