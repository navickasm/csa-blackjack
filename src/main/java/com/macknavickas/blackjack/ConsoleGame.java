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
        System.out.println("Enter your name... ");

        d = new Dealer(new Player[new Player(2)]);
    }
}
