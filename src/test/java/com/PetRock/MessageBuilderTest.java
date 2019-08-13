package com.PetRock;

import org.junit.Test;

import static org.junit.Assert.*;

public class MessageBuilderTest {

    @Test
    public void getHelloWorld() {
        assertEquals("hello world", MessageBuilder.getHelloWorld());
    }

    @Test
    public void getNumber10() {
        assertEquals(10, MessageBuilder.getNumber10());
    }
}