package com.macknavickas.blackjack;

import java.util.ArrayList;

public class Player {
    ArrayList<Hand> hand;

    public Player() {
        hand = new ArrayList<>();
        hand.add(new Hand());
    }

    public void getBet() {
        // Ask the player, "What is your bet?"
    }

    public void reset() {
        hand.clear();
    }
}