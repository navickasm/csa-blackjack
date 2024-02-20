package com.macknavickas.blackjack;

import com.macknavickas.cardgame.Card;

import java.util.ArrayList;

public class Hand {
    /**
     * addCard() -> addCard()
     * getSize() -> getSize()
     * getHandValue()
     * clearHand()
     * blackjack()
     * bust()
     * getHand()
     * toString()
     *
     * A 2 A
     * A 2 A K
     * A 2 A A 8
     * A J
     * 10 7 4
     * bust
     */

    ArrayList<Card> hand;

    public Hand() {
        hand = new ArrayList<>();
    }

    public void addCard(Card c) { hand.add(c); }

    public int getSize() { return hand.size(); }

    public int getHandValue() {

    }

    public int numAces() {
        int n = 0;
        for (Card c : hand) {
            if (c.getRank() == 1) { n++; }
        }
        return n;
    }


}
