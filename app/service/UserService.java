package com.example.blockchainvoting.service;

import com.example.blockchainvoting.model.User;
import com.example.blockchainvoting.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashSet;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private EmailService emailService;

    public void registerUser(String username, String password, String email) {
        User user = new User(username, passwordEncoder.encode(password), new HashSet<>());
        user.getRoles().add("ROLE_USER");
        userRepository.save(user);

      
        String subject = "Welcome to Blockchain Voting - Confirm Your Email";
        String text = "Hello " + username + ",\n\nPlease confirm your email address by clicking the link below:\n"
                      + "http://localhost:8080/confirm-email?username=" + username;

        emailService.sendEmail(email, subject, text);
    }

    public void registerAdmin(String username, String password) {
        User user = new User(username, passwordEncoder.encode(password), new HashSet<>());
        user.getRoles().add("ROLE_ADMIN");
        userRepository.save(user);
    }

    @PostConstruct
    public void initAdminUser() {
        if (userRepository.findByUsername("admin") == null) {
            registerAdmin("admin", "admin123");
        }
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return org.springframework.security.core.userdetails.User
                .withUsername(user.getUsername())
                .password(user.getPassword())
                .roles(user.getRoles().toArray(new String[0]))
                .build();
    }
}
