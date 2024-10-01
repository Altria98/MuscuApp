package com.example.MuscuApp.dl.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@ToString @EqualsAndHashCode
@Entity
@Table(name = "seance")
public class Seance extends BaseEntity<Long>{

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "public_")
    private boolean public_;

    @Column(name = "approved")
    private boolean approved;

    @ManyToMany(mappedBy = "seances")
    private List<Exercise> exercises;

    @ManyToMany(mappedBy = "seances")
    private List<User> users;


    @ManyToOne
    @JoinColumn(name = "environment_id")
    private Environment environment;

    @ManyToOne
    @JoinColumn(name = "Groupe_musculaire_id")
    private GroupeMusculaire groupeMusculaire;


}
