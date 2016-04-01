package com.william;

import java.util.HashMap;
import java.util.Random;

/**
 * Created by william on 01.04.16.
 */
public class DiceGame {
    public int dice1;
    public int dice2;
    public static final HashMap profitTable = new HashMap<Integer, Double>();
    private static final Random randomGenerator = new Random();

    public DiceGame() {
        // init the profit table
        profitTable.put(2, -0.5);
        profitTable.put(3, -0.5);
        profitTable.put(4, -0.5);
        profitTable.put(5, -0.5);
        profitTable.put(6, -0.5);
        profitTable.put(7, 0.0);
        profitTable.put(8, 0.0);
        profitTable.put(9, 0.0);
        profitTable.put(10, 0.5);
        profitTable.put(11, 1.0);
        profitTable.put(12, 1.5);
    }

    public int rollDices() {
        // roll the dices and sum up their number
        dice1 = randomGenerator.nextInt(6) + 1;
        dice2 = randomGenerator.nextInt(6) + 1;
        int sum = dice1 + dice2;

        // reset dices
        dice1 = dice2 = 0;
        return sum;
    }

    public double getPayBack(int sum) {
        return (Double) profitTable.get(sum);
    }
}
