package com.example.MuscuApp.bbl.models.user;

import com.example.MuscuApp.dl.entities.User;
import com.example.MuscuApp.dl.entities.enums.UserRole;
import lombok.Data;

@Data
public class UserTokenDTO {

    private Long id;
    private String login;
    private UserRole role;
    private String token;

    public UserTokenDTO(Long id, String login, UserRole role) {
        this.id = id;
        this.login = login;
        this.role = role;
    }

    public static UserTokenDTO fromEntity(User user) {
        return new UserTokenDTO(user.getId(), user.getLogin(), user.getRole());
    }
}
