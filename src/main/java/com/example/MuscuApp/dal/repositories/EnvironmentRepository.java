package com.example.MuscuApp.dal.repositories;

import com.example.MuscuApp.dl.entities.Environment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvironmentRepository extends JpaRepository<Environment,Long> {
}
