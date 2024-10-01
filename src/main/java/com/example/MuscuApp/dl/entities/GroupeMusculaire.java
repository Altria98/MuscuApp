package com.example.MuscuApp.dl.entities;

import com.example.MuscuApp.dl.entities.enums.GroupeMusculaireList;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@ToString @EqualsAndHashCode
@Entity
@Table(name = "groupe_musculaire")
public class GroupeMusculaire extends BaseEntity<Long>{

    @Enumerated(EnumType.STRING)
    @Column(name = "name")//,nullable = true)
    private GroupeMusculaireList groupeMusculaire;

    @OneToMany(mappedBy = "groupeMusculaire")
    private List<Muscle> muscles;

    @OneToMany(mappedBy = "groupeMusculaire")
    private List<Seance> seances;

}
