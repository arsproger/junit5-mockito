package com.example.junit5itacademystarter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StringFormattingTest {
    private StringFormatting stringFormatting;

    @BeforeEach
    void init() {
        stringFormatting = new StringFormatting();
    }

    @Test
    void testReverse() {
        assertEquals(stringFormatting.reverse("Hello"), "olleH");
    }

    @Test
    void testToUpper() {
        assertEquals(stringFormatting.toUpperString("Arsen"), "ARSEN");
    }

    @Test
    void testIdPalindrome() {
        assertEquals(stringFormatting.isPalindrome("anna"), true);
    }

}
