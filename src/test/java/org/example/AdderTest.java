package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AdderTest {

    @Test
    public void testAdd() {

        Adder adder = new Adder();

        // Test adding negative numbers
        assertEquals(9, adder.add(5, 4));

        // Test adding a positive and a negative number
        //  assertEquals(0, adder.add(5, -5));

        // Test adding 0
        // assertEquals(5, adder.add(5, 0));
    }

    @Test
    public void testAddNegatives() {

        Adder adder = new Adder();

        // Test adding negative numbers
        assertEquals(-10, adder.add(-5, -5));

        // Test adding a positive and a negative number
        //  assertEquals(0, adder.add(5, -5));

        // Test adding 0
        // assertEquals(5, adder.add(5, 0));
    }

//    @Test
//    public void testAddZero() {
//
//        Adder adder = new Adder();
//
//        // Test adding 0
//        assertEquals(5, adder.add(5, 0));
//    }
}