package com.example.mockito.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.mockito.model.User;
import com.example.mockito.repository.UserRepository;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> getUserById(long userId) {
        return userRepository.findById(userId);
    }

    public void createUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(User user) {
        userRepository.update(user);
    }

    public void deleteUser(long userId) {
        userRepository.delete(userId);
    }
}

