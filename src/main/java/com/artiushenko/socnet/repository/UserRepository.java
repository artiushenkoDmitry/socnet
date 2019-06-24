package com.artiushenko.socnet.repository;

import com.artiushenko.socnet.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
