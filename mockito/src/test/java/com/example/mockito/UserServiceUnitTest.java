package com.example.mockito;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.mockito.repository.UserRepository;
import com.example.mockito.service.UserService;

@ExtendWith(MockitoExtension.class)
public class UserServiceUnitTest {
    @Mock 
    UserRepository userRepository;

    @InjectMocks
    UserService userService;
}
