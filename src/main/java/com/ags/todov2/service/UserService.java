package com.ags.todov2.service;

import com.ags.todov2.model.User;
import com.ags.todov2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    /**
     * Return:
     * 0 -> success
     * 50 -> Cannot find user
     */
    public User login(String username, String password) {
        return findByUsername(username);
    }

}

