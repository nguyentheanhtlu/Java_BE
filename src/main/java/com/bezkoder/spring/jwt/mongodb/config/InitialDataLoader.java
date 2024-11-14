package com.bezkoder.spring.jwt.mongodb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bezkoder.spring.jwt.mongodb.models.ERole;
import com.bezkoder.spring.jwt.mongodb.models.Role;
import com.bezkoder.spring.jwt.mongodb.repository.RoleRepository;

@Component
public class InitialDataLoader implements CommandLineRunner {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void run(String... args) {
        // Chỉ tạo roles nếu collection roles đang trống
        if (roleRepository.count() == 0) {
            Role adminRole = new Role();
            adminRole.setName(ERole.ROLE_ADMIN);
            roleRepository.save(adminRole);

            Role userRole = new Role();
            userRole.setName(ERole.ROLE_USER);
            roleRepository.save(userRole);

            System.out.println("Roles initialized successfully");
        }
    }
} 