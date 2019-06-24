package com.artiushenko.socnet.service;

import com.artiushenko.socnet.entity.Education;
import com.artiushenko.socnet.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService {

    @Autowired
    EducationRepository repository;

    public List<Education> findAll() {
        List<Education> list = repository.findAll();
        return list;
    }

    public Education create(Education education) {
        return repository.save(education);
    }

    public void delete(long id) {
        repository.deleteById(id);
    }

    public Education select(long id) {
        return repository.findById(id).get();
    }
}
