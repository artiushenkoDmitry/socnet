package com.artiushenko.socnet.controller;

import com.artiushenko.socnet.entity.FamilyStatus;
import com.artiushenko.socnet.entity.Town;
import com.artiushenko.socnet.service.FamilyStatusService;
import com.artiushenko.socnet.service.TownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/town")
public class TownController {
    @Autowired
    private TownService service;

    @GetMapping(value = "/all")
    public List<Town> getAll(){
        List<Town> towns = service.findAll();
        return towns;
    }

    @PostMapping
    public Town create(@RequestBody Town town) {
        return service.create(town);
    }

    @CrossOrigin
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        service.delete(id);
    }

    @CrossOrigin
    @GetMapping("/select/{id}")
    public Town selectOne(@PathVariable("id") int id){
        Town town = service.select(id);
        return town;
    }
}
