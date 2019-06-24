package com.artiushenko.socnet.controller;

import com.artiushenko.socnet.entity.Education;
import com.artiushenko.socnet.entity.FamilyStatus;
import com.artiushenko.socnet.service.EducationService;
import com.artiushenko.socnet.service.FamilyStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/education")
public class EducationController {
    @Autowired
    private EducationService service;

    @GetMapping(value = "/all")
    public List<Education> getAll(){
        List<Education> educations = service.findAll();
        return educations;
    }

    @PostMapping
    public Education create(@RequestBody Education education) {
        return service.create(education);
    }

    @CrossOrigin
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        service.delete(id);
    }

    @CrossOrigin
    @GetMapping("/select/{id}")
    public Education selectOne(@PathVariable("id") int id){
        Education education = service.select(id);
        return education;
    }
}
