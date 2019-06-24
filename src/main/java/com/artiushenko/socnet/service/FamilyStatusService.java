package com.artiushenko.socnet.service;

import com.artiushenko.socnet.entity.FamilyStatus;
import com.artiushenko.socnet.repository.FamilyStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyStatusService {

    @Autowired
    FamilyStatusRepository repository;

    public List<FamilyStatus> findAll() {
        List<FamilyStatus> list = repository.findAll();
        return list;
    }

    public FamilyStatus create(FamilyStatus familyStatus) {
        return repository.save(familyStatus);
    }

    public void delete(long id) {
        repository.deleteById(id);
    }

    public FamilyStatus select(long id) {
        return repository.findById(id).get();
    }
}
