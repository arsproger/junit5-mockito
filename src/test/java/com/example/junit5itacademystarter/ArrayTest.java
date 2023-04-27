package com.example.junit5itacademystarter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ArrayTest {
    private Array array;

    @BeforeEach
    void init() {
        array = new Array();
    }

    @Test
    void testMaxElement() {
        assertEquals(array.maxValueList(Arrays.asList(1, 2, 3, 4, 5)), 5);
    }

    @Test
    void testEqualElementSum() {
        List<Integer> res = array.sumBinaryList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6));
        assertThat(res).isEqualTo(Arrays.asList(5, 7, 9));
    }

    @Test
    void testThrowException() {
        assertThrows(IllegalArgumentException.class,
                () -> array.sumBinaryList(Arrays.asList(1, 2, 3, 4), Arrays.asList(5, 6, 7)));
    }

    @Test
    void testEvenValues() {
        assertThat(array.onlyEvenValue(Arrays.asList(1, 2, 3, 4, 5))).isEqualTo(Arrays.asList(2, 4));
    }


}
