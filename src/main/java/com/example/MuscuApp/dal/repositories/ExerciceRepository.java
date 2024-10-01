package com.example.MuscuApp.dal.repositories;

import com.example.MuscuApp.dl.entities.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExerciceRepository extends JpaRepository<Exercise,Long> {

}
