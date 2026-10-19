package com.KBPRASAC.TaskBoard.user.repository;

import com.KBPRASAC.TaskBoard.user.entity.User;
import com.corebackend.common.repository.BaseRepository;

import java.util.Optional;

public interface UserRepository extends BaseRepository<User> {

    Optional<User> findByUsername(String username);

}