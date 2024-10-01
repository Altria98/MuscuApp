package com.example.MuscuApp.dal;


import com.example.MuscuApp.dal.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {

//        if(userRepository.count() == 0) {
//            String password = passwordEncoder.encode("Test1234=");
//            User admin = new User("Admin3","admin",password, UserRole.ADMIN);
//
//
//            userRepository.save(admin);
//
//            User user = new User("Rufus 3ieme","User",password,UserRole.USER);
//
//            userRepository.save(user);
//        }
//        GroupeMusculaire bras = new GroupeMusculaire();
//        bras.setGroupeMusculaire(GroupeMusculaireList.BRAS);

    }
}

