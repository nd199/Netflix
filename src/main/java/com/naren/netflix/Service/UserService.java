package com.naren.netflix.Service;

import com.naren.netflix.Entity.User;

public interface UserService {
    User newUser(User user);

    User findById(Long userId);

    User watchedBy(User user);
}
