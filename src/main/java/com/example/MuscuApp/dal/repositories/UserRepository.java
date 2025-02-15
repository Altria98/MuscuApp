package com.example.MuscuApp.dal.repositories;

import com.example.MuscuApp.dl.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query( "Select u " +
            "from User u " +
            "where u.username ilike :username")
    Optional<User> findByUsername(String username);

}
