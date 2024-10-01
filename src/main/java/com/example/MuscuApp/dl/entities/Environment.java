package com.example.MuscuApp.dl.entities;

import com.example.MuscuApp.dl.entities.enums.EnvironmentList;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@ToString @EqualsAndHashCode
@Entity
@Table(name = "environment")
public class Environment extends BaseEntity<Long>{

    @Enumerated(EnumType.STRING)
    @Column(name = "name")//,nullable = true)
    private EnvironmentList environment;


    @ManyToMany(mappedBy = "environments")
    private List<Materiel> materiels;

    @OneToMany(mappedBy = "environment")
    private List<Seance> seances;

}
