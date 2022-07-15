package dev.andrylat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    App app = new App();
    @Test
    void test_both_are_positive() {
        int actual = app.sum(1,2);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void test_both_are_negative() {
        int actual = app.sum(-1,-2);
        int expected = -3;

        assertEquals(expected, actual);
    }
}
