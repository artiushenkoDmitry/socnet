package com.artiushenko.socnet.controller;

import com.artiushenko.socnet.entity.FamilyStatus;
import com.artiushenko.socnet.entity.School;
import com.artiushenko.socnet.service.FamilyStatusService;
import com.artiushenko.socnet.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/school")
public class SchoolController {
    @Autowired
    private SchoolService service;

    @GetMapping(value = "/all")
    public List<School> getAll(){
        List<School> schools = service.findAll();
        return schools;
    }

    @PostMapping
    public School create(@RequestBody School school) {
        return service.create(school);
    }

    @CrossOrigin
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        service.delete(id);
    }

    @CrossOrigin
    @GetMapping("/select/{id}")
    public School selectOne(@PathVariable("id") int id){
        School school = service.select(id);
        return school;
    }
}
