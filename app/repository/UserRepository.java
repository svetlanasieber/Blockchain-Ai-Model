package com.example.blockchainvoting.repository;

import com.example.blockchainvoting.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByConfirmationToken(String confirmationToken); 
}
