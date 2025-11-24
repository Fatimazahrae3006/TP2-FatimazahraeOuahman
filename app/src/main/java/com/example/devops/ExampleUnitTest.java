package com.example.devops;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void messageNotEmpty() {
        String message = "Welcome to My First Android App!";
        assertNotNull(message);
        assertTrue(message.length() > 0);
    }

    @Test
    public void messageContainsKeyword() {
        String message = "Welcome to My First Android App!";
        assertTrue(message.contains("Android"));
    }
}