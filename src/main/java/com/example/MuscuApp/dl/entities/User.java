package com.example.MuscuApp.dl.entities;

import com.example.MuscuApp.dl.entities.enums.UserRole;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode()
@Table(name = "user_muscu")
@ToString
public class User extends BaseEntity<Long> implements UserDetails {

    @Getter @Setter
    @Column(name = "USERNAME",unique = true, nullable = false, length = 100)
    private String username;

    @Getter @Setter
    @Column(name = "LOGIN", nullable = false, length = 100)
    private String login;

    @Getter @Setter
    @Column(name = "PASSWORD", nullable = false, length = 100)
    private String password;

    @Getter @Setter
    @Column(name = "ROLE",nullable = true)
    @Enumerated(EnumType.STRING)
    private UserRole role = UserRole.USER;

    @ManyToMany
    @JoinTable(
            name = "User_Exercices",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "exercice_id")
    )
    private List<Exercise> exercises;

    @ManyToMany
    @JoinTable(
            name = "User_Seance",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "seance_id")
    )
    private List<Seance> seances;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(this.role.toString()));
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}