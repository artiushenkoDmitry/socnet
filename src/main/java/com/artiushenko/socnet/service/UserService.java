package com.artiushenko.socnet.service;

import com.artiushenko.socnet.entity.User;
import com.artiushenko.socnet.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public List<User> findAll() {
        List<User> list = repository.findAll();
        return list;
    }

    public User create(User user) {
        return repository.save(user);
    }

    public void delete(long id) {
        repository.deleteById(id);
    }

    public User select(long id) {
        return repository.findById(id).get();
    }
}
