package com.macknavickas.blackjack;

import java.util.ArrayList;

public class Player {
    ArrayList<Hand> hand;

    int currentHand;

    double bankroll;

    public Player(double startingBankroll) {
        hand = new ArrayList<>();
        hand.add(new Hand());
        currentHand = 0;
        bankroll = startingBankroll;
    }

    public double getBet() {
        return 10.0;
        // Ask the player, "What is your bet?"
    }

    public Move getMove() {
        return Move.STAND;
        // IMPLEMENT THIS
    }

    public void payAmount(double amount) {
        bankroll += amount;
    }

    public void reset() {
        hand.clear();
        hand.add(new Hand());
    }
}