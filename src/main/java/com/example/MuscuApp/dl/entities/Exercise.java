package com.example.MuscuApp.dl.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@ToString @EqualsAndHashCode
@Entity
@Table(name = "exercice")
public class Exercise extends BaseEntity<Long> {

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "weight")
    private int weight;

    @Column(name = "repetion")
    private int repetition;

    @Column(name = "serie")
    private int serie;

    @Column(name = "public_")
    private boolean public_;

    @Column(name = "approved")
    private boolean approved;

    @ManyToMany
    @JoinTable(
            name = "Seance_Exercices",
            joinColumns = @JoinColumn(name = "exercice_id"),
            inverseJoinColumns = @JoinColumn(name = "seance_id")
    )
    private List<Seance> seances;

    @ManyToMany(mappedBy = "exercises")
    private List<User> users;






}
