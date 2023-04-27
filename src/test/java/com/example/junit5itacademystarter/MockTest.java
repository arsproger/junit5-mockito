package com.example.junit5itacademystarter;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.ExpectedCount.times;

@RunWith(MockitoJUnitRunner.class)
public class MockTest {
//    @Mock
//    private UserRepository userRepository;
//    @InjectMocks
//    private UserService userService;
//
//    @Test
//    void test() {
//        User user = new User(1, "Arsen");
//        when(userRepository.findById(1L)).thenReturn(Optional.of(user));
//
//        User actualUser = userService.getById(1L);
//        assertEquals(user, actualUser);
//
//        verify(userRepository, times(1).findById(1L));
//    }
}
