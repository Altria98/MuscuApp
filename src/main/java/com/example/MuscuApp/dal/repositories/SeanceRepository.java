package com.example.MuscuApp.dal.repositories;

import com.example.MuscuApp.dl.entities.Seance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SeanceRepository extends JpaRepository<Seance,Long> {

}
