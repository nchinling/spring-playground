package com.example.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.mockito.model.User;
import com.example.mockito.repository.UserRepository;
import com.example.mockito.service.UserService;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @Mock 
    UserRepository userRepository;

    @InjectMocks
    UserService userService;

    private User userMock;
    @BeforeEach
    void setUp() {
        userMock = mock(User.class);

    }

    @Test
    void getUserById_ReturnsUserSuccessfully() {
        // Given (stubbing)
        when(userRepository.findById(1L)).thenReturn(Optional.of(userMock));
        when(userMock.getId()).thenReturn(1L);
        when(userMock.getUsername()).thenReturn("john99");
        when(userMock.getEmail()).thenReturn("john@email.com");

        // When
        Optional<User> userRetrieved = userService.getUserById(1L);

        // Then
        assertEquals(userMock, userRetrieved.get());
        assertEquals(userMock.getId(), userRetrieved.get().getId());
        assertEquals(userMock.getUsername(), userRetrieved.get().getUsername());
        assertEquals(userMock.getEmail(), userRetrieved.get().getEmail());
    }

    @Test
    void createUser_UserSavedSuccessfully() {
        // When
        userService.createUser(userMock);

        // Then
        verify(userRepository).save(userMock);
    }

    @Test
    void updateUser_UserUpdatedSuccessfully() {
        // When
        userService.updateUser(userMock);

        // Then
        verify(userRepository).update(userMock);
    }

    @Test
    void deleteUser_UserDeletedSuccessfully() {
        // When
        userService.deleteUser(1L);

        // Then
        verify(userRepository).delete(1L);
    }
}
