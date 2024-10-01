package com.example.MuscuApp.dl.entities;

import com.example.MuscuApp.dl.entities.enums.MaterielList;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@ToString @EqualsAndHashCode
@Entity
@Table(name = "materiel")
public class Materiel extends BaseEntity<Long>{

    @Getter @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "MATERIEL",nullable = true)
    private MaterielList materiel;

    @ManyToMany
    @JoinTable(
            name = "Environment_Material",
            joinColumns = @JoinColumn(name = "materiel_id"),
            inverseJoinColumns = @JoinColumn(name = "environment_id")
    )
    private List<Environment> environments;

}
