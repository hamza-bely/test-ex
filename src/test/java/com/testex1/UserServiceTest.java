package com.testex1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.testex1.service.UserService;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserService();
    }

    @Test
    void testGetUserGreeting() {
        String greeting = userService.getUserGreeting("hamza" );
        assertEquals("hamza", greeting);
    }

    @Test
    void somme() {
        int greeting = userService.somme(1,1 );
        assertEquals(2, greeting);
    }
}
