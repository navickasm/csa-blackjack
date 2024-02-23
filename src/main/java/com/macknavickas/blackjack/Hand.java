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
        int value = 0;
        for (Card c : hand) {
            if (c.getRank() == 1) {
                value += (value + 11 <= 21 ? 11 : 1);
            } else if (c.getRank() > 10 && c.getRank() < 14) {
                value += 10;
            } else {
                value += c.getRank();
            }
        }
        return value;
    }

    public int numAces() {
        int n = 0;
        for (Card c : hand) {
            if (c.getRank() == 1) { n++; }
        }
        return n;
    }

    public void clearHand() {
        hand.clear();
    }

    public boolean blackjack() {
        return this.getHandValue() == 21 && this.getSize() == 2;
    }

    public boolean bust () {
        return this.getHandValue() > 21;
    }

    public ArrayList<Card> getHand() { return hand; }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Card c : hand) {
            s.append(c.toString()).append(" ");
        }
        return s.toString();
    }
}
