package com.example.mockito.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.mockito.model.User;

@Repository
public class UserRepository {

    private Map<Long, User> users = new HashMap<>();


    public Optional<User> findById(long userId) {
        return Optional.ofNullable(users.get(userId));
    }


    public void save(User user) {
        users.put(user.getId(), user);
    }


    public void update(User user) {
        users.put(user.getId(), user);
    }


    public void delete(long userId) {
        users.remove(userId);
    }
    
}
