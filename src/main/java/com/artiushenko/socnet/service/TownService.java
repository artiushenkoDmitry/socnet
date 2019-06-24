package com.artiushenko.socnet.service;

import com.artiushenko.socnet.entity.Town;
import com.artiushenko.socnet.repository.TownRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TownService {

    @Autowired
    TownRepository repository;

    public List<Town> findAll() {
        List<Town> list = repository.findAll();
        return list;
    }

    public Town create(Town town) {
        return repository.save(town);
    }

    public void delete(long id) {
        repository.deleteById(id);
    }

    public Town select(long id) {
        return repository.findById(id).get();
    }
}
