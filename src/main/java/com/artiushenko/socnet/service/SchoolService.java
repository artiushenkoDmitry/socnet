package com.artiushenko.socnet.service;

import com.artiushenko.socnet.entity.School;
import com.artiushenko.socnet.entity.School;
import com.artiushenko.socnet.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    SchoolRepository repository;

    public List<School> findAll() {
        List<School> list = repository.findAll();
        return list;
    }

    public School create(School school) {
        return repository.save(school);
    }

    public void delete(long id) {
        repository.deleteById(id);
    }

    public School select(long id) {
        return repository.findById(id).get();
    }
}
