package com.example.MuscuApp.dal.repositories;

import com.example.MuscuApp.dl.entities.GroupeMusculaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupeMusculaireRepository extends JpaRepository<GroupeMusculaire,Long> {
}
