package com.KBPRASAC.TaskBoard.auth;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

class PasswordEncoderTest {

    @Test
    void generatePassword() {

        BCryptPasswordEncoder encoder =
                new BCryptPasswordEncoder();

        String password = "password123";

        String hash = encoder.encode(password);

        System.out.println("Password: " + password);
        System.out.println("Hash: " + hash);
    }
}