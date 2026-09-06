package com.KBPRASAC.TaskBoard.user.service.impl;

import com.KBPRASAC.TaskBoard.user.entity.User;
import com.KBPRASAC.TaskBoard.user.repository.UserRepository;
import com.KBPRASAC.TaskBoard.user.service.UserService;
import com.corebackend.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl
        extends BaseServiceImpl<User>
        implements UserService {

    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }
}