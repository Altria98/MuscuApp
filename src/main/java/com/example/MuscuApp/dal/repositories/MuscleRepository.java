package com.example.MuscuApp.dal.repositories;

import com.example.MuscuApp.dl.entities.Muscle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MuscleRepository extends JpaRepository<Muscle,Long> {
}
