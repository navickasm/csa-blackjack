package com.macknavickas.blackjack;

public class Dealer {

    Player[] players;

    double[] bets;

    public Dealer(Player[] players) {
        this.players = players;
    }

    public void takeBets() {
        bets = new double[players.length];
        for (int i = 0; i < players.length; i++) {
            bets[i] = players[i].getBet();
        }
    }

    public void dealCards() {

    }

    public void startRound() {

    }

    public void init() {

    }
}
