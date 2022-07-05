package com.naren.netflix.Service.Impl;

import com.naren.netflix.Repository.UserRepository;
import com.naren.netflix.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
}
