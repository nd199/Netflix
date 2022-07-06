package com.naren.netflix.Service.Impl;

import com.naren.netflix.Entity.User;
import com.naren.netflix.Repository.UserRepository;
import com.naren.netflix.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User newUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findById(Long userId) {
        return userRepository.findById(userId).orElseThrow(
                () -> new RuntimeException("User not Found")
        );
    }

    @Override
    public User watchedBy(User user) {
        return userRepository.save(user);
    }
}
