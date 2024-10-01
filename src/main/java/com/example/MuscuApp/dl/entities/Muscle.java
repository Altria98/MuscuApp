package com.example.MuscuApp.dl.entities;

import com.example.MuscuApp.dl.entities.enums.MuscleList;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@ToString @EqualsAndHashCode
@Entity
@Table(name = "muscle")
public class Muscle extends BaseEntity<Long>{

    @Enumerated(EnumType.STRING)
    @Column(name = "name")//,nullable = true)
    private MuscleList muscle;

    @ManyToOne
    @JoinColumn(name = "groupe_muscle_id")
    private GroupeMusculaire groupeMusculaire;

}
