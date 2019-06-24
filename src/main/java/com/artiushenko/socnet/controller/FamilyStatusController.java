package com.artiushenko.socnet.controller;

//import com.artiushenko.socnet.service.FamilyStatusService;
import com.artiushenko.socnet.entity.FamilyStatus;
import com.artiushenko.socnet.service.FamilyStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/familyStatus")
public class FamilyStatusController {
    @Autowired
    private FamilyStatusService service;

    @GetMapping(value = "/all")
    public List<FamilyStatus> getAll(){
        List<FamilyStatus> familyStatuses = service.findAll();
        return familyStatuses;
    }

    @PostMapping
    public FamilyStatus create(@RequestBody FamilyStatus familyStatus) {
        return service.create(familyStatus);
    }

    @CrossOrigin
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        service.delete(id);
    }

    @CrossOrigin
    @GetMapping("/select/{id}")
    public FamilyStatus selectOne(@PathVariable("id") int id){
        FamilyStatus familyStatus = service.select(id);
        return familyStatus ;
    }
}
