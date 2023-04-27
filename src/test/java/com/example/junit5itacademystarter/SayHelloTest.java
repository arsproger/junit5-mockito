package com.example.junit5itacademystarter;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SayHelloTest {
    private SayHello sayHello;

    @BeforeAll
    void prepare() {
        System.out.println("Before all starting");
    }

    @BeforeEach
    void init() {
        System.out.println("Before each starting");
        sayHello = new SayHello();
    }

    @ParameterizedTest
    @CsvSource({
            "Arsen",
            "Ruslan",
            "Bob"
    })
    void testSayHello(String name) {
        String res = sayHello.sayHello(name);
        assertEquals(res, "Hello, " + name);
    }

    @AfterEach
    void prepareAfter() {
        System.out.println("After each stating");
    }

    @AfterAll
    void destroy() {
        System.out.println("After all starting");
    }
}
