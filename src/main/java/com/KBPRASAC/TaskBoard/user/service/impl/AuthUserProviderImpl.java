package com.KBPRASAC.TaskBoard.user.service.impl;

import com.KBPRASAC.TaskBoard.user.repository.UserRepository;
import com.corebackend.auth.entity.AuthUser;
import com.corebackend.auth.service.AuthUserProvider;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthUserProviderImpl implements AuthUserProvider {

    private final UserRepository userRepository;

    public AuthUserProviderImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<AuthUser> findByUsername(String username) {
        return userRepository
                .findByUsername(username)
                .map(user -> (AuthUser) user);
    }
}