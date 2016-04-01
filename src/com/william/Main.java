package com.william;

public class Main {

    public static void main(String[] args) {
        // init the game and balance
        DiceGame diceGame = new DiceGame();
        double balance = 0.5;

        // play 1000 rounds then check balance
        for(int i = 0; i < 1000; i++) {
            int sum = diceGame.rollDices();
            double payback = diceGame.getPayBack(sum);
            balance += payback;
        }

        System.out.println("After 1000 rounds, we are supposed bo have " + balance + " Euros in our account.");
        if(balance < 0.5) {
            System.out.println("The game is not worthy to play.");
        }
    }
}
