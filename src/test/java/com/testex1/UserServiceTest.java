package com.testex1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import service.UserService;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserService();
    }

    @Test
    void testGetUserGreeting() {
        String greeting = userService.getUserGreeting("John" );
        assertEquals("Hello, John!", greeting);
    }
}
