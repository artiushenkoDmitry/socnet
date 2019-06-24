package com.artiushenko.socnet.repository;

import com.artiushenko.socnet.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Long> {
}
