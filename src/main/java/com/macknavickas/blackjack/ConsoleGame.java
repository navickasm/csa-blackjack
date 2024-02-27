package com.macknavickas.blackjack;

import java.util.Scanner;

public class ConsoleGame {

    Dealer d;

    public void init() {
        Scanner sc = new Scanner(System.in);

        System.out.println("-- BLACKJACK --");
        System.out.println("--  v 0.1.0  --");
        System.out.println("---------------");
        System.out.println();
        System.out.println("Single player mode");
        System.out.print("Enter your name... ");

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input

        //d = new Dealer(new Player[new Player(2)]);
    }
}
