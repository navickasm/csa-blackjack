package com.macknavickas.blackjack;

import com.macknavickas.cardgame.Card;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand;

    public Hand() {
        hand = new ArrayList<>();
    }

    public void addCard(Card c) { hand.add(c); }

    public ArrayList<Card> getHand() { return hand; }
}
