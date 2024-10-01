package com.example.MuscuApp.bbl.services;

import com.example.MuscuApp.dl.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User login(String username, String password);

}
