package com.macknavickas.blackjack;

public class Dealer {

    Player[] players;

    Bet[] roundBets;

    public Dealer(Player[] players) {
        this.players = players;
    }

    public void takeBets() {
        for (Player p : players) {
            p.getBet();
        }
    }

    public void dealCards() {

    }

    public void startRound() {

    }

    public void init() {

    }
}
