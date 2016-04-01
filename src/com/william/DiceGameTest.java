package com.william;

import junit.framework.TestCase;

import static org.junit.Assert.*;

/**
 * Created by william on 01.04.16.
 */
public class DiceGameTest extends TestCase {
    DiceGame diceGame = new DiceGame();

    @org.junit.Test
    public void testRollDices() throws Exception {
        for(int i = 0; i < 50; i++) {
            int sum = diceGame.rollDices();
            assertTrue( 2 <= sum && sum <= 12);
        }
    }

    @org.junit.Test
    public void testGetPayBack() throws Exception {
        assertEquals(-0.5, diceGame.getPayBack(2));
        assertEquals(-0.5, diceGame.getPayBack(3));
        assertEquals(-0.5, diceGame.getPayBack(4));
        assertEquals(-0.5, diceGame.getPayBack(5));
        assertEquals(-0.5, diceGame.getPayBack(6));
        assertEquals(0.0, diceGame.getPayBack(7));
        assertEquals(0.0, diceGame.getPayBack(8));
        assertEquals(0.0, diceGame.getPayBack(9));
        assertEquals(0.5, diceGame.getPayBack(10));
        assertEquals(1.0, diceGame.getPayBack(11));
        assertEquals(1.5, diceGame.getPayBack(12));
    }

}