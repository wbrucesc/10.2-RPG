package com.will;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int turn = 0;
        int lastTurn = 10;


        Random rng = new Random();          //random number generator
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();


        System.out.println("Application running!");
//
//        turn++; //beginning of first turn
//
//        Fighter will = new Fighter();
//        CloseRangeMonster scaryTerry = new CloseRangeMonster();
//
//        will.attack(scaryTerry);
//
//        scaryTerry.getLifePoints();
//
//        turn++; //end of first turn/beginning of second turn
//
////        System.out.println(will.getLifePoints());

        turn++;
        Fighter will = new Fighter();


        while (turn <= lastTurn) {
            int diceRoll = rng.nextInt(50) + 1;
            System.out.println(diceRoll);

            if (diceRoll > 25) {
                CloseRangeMonster scaryTerry = new CloseRangeMonster();
                System.out.println("A monster has appeared. Choose your next move wisely..");
                while (scaryTerry.getLifePoints() > 0) {
                    System.out.println("Do you choose to attack (A) or escape (E)?");
                    userInput = scanner.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        will.attack(scaryTerry);
                        System.out.println("Great attack! Your enemy now has " + scaryTerry.getLifePoints());
                        break;
                    } else if (userInput.equalsIgnoreCase("E")) {
                        System.out.println("You escaped successfully");
                        break;
                    }
                }


            }
        }
        turn++;


    }
}

