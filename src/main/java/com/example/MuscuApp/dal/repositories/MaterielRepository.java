package com.example.MuscuApp.dal.repositories;

import com.example.MuscuApp.dl.entities.Materiel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterielRepository extends JpaRepository<Materiel,Long> {
}
