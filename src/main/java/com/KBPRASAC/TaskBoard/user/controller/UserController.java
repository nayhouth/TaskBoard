package com.KBPRASAC.TaskBoard.user.controller;

import com.KBPRASAC.TaskBoard.user.entity.User;
import com.KBPRASAC.TaskBoard.user.service.UserService;
import com.corebackend.controller.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController
        extends BaseController<User> {

    public UserController(UserService service) {
        super(service);
    }
}