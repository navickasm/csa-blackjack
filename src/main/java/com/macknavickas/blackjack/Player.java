package com.macknavickas.blackjack;

import java.util.ArrayList;

public class Player {
    ArrayList<Hand> hand;

    double bankroll;

    public Player() {
        hand = new ArrayList<>();
        hand.add(new Hand());
    }

    public double getBet() {
        return 10.0;
        // Ask the player, "What is your bet?"
    }

    public void payAmount(double amount) {
        bankroll += amount;
    }

    public void reset() {
        hand.clear();
    }
}