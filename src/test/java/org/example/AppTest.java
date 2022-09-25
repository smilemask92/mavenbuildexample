package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {
    String apple;
    String banana;

    @Before
    public void initString() {
        apple = "apple";
        banana = "banana";
    }

    @Test
    public void shouldAnswerWithTrueOrFalse() {
        assertTrue(true);
        assertFalse(false);
    }

    @Test
    public void shouldInitString() {
        assertEquals(apple, "apple");
    }
}
