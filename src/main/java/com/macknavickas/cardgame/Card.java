package com.macknavickas.cardgame;

/**
 * A basic card in a playing card deck.
 */
public class Card {
    private final Suit s;

    private final int v;

    /**
     * Values are stored as follows:
     * - ACE -> 1
     * - 2-10 -> 2-10
     * - J -> 11
     * - Q -> 12
     * - K -> 13
     * @param suit The suit of the card.
     * @param value The value of the card.
     */
    public Card(Suit suit, int value) {
        s = suit;

        if (value > 14 || value < 1)
            throw new IllegalArgumentException("Value must be from 1 to 14.");

        v = value;
    }

    public Suit getSuit() { return s; }

    public int getValue() { return v; }

    public static String getValueString(int v) {
        if (v == 1) return "ACE";
        else if (v > 1 && v < 11) return Integer.toString(v);
        else if (v == 11) return "JACK";
        else if (v == 12) return "QUEEN";
        else if (v == 13) return "KING";
        else if (v == 14) return "JOKER";
        else throw new IllegalArgumentException("Value must be from 1 to 14.");
    }

    public String toString() { return getValueString(this.v) + s.getSuitSymbol(); }
}
