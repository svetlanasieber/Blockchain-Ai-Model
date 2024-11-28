package com.example.blockchainvoting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BlockchainVotingApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlockchainVotingApplication.class, args);
    }
}
