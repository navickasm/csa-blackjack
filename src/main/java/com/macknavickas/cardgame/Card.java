package com.macknavickas.cardgame;

/**
 * A basic card in a playing card deck.
 */
public class Card {
    private final Suit s;

    private final int r;

    /**
     * false if Ace = 1
     * true if Ace = 11
     */
    private boolean ace = true;

    /**
     * Values are stored as follows:
     * - ACE -> 1
     * - 2-10 -> 2-10
     * - J -> 11
     * - Q -> 12
     * - K -> 13
     * @param suit The suit of the card.
     * @param rank The rank of the card.
     */
    public Card(Suit suit, int rank) {
        s = suit;

        if (rank > 14 || rank < 1)
            throw new IllegalArgumentException("Value must be from 1 to 14.");

        r = rank;
    }

    public Card(Suit suit, String rank) {
        this(suit, stringToRankInt(rank));
    }

    private static int stringToRankInt(String rank) {
        int newRank;

        switch (rank) {
            case "ACE":
                newRank = 1;
                break;
            case "JACK":
                newRank = 11;
                break;
            case "QUEEN":
                newRank = 12;
                break;
            case "KING":
                newRank = 13;
                break;
            default:
                newRank = Integer.parseInt(rank);
                break;
        }

        return newRank;
    }

    public Suit getSuit() { return s; }

    public int getRank() { return r; }

    /**
     * Get the String corresponding to the rank stored.
     * @param r The rank
     * @return Rank string, all uppercase, ACE, JACK, QUEEN, KING, or number
     */
    public static String getRankString(int r) {
        if (r == 1) return "ACE";
        else if (r > 1 && r < 11) return Integer.toString(r);
        else if (r == 11) return "JACK";
        else if (r == 12) return "QUEEN";
        else if (r == 13) return "KING";
        else throw new IllegalArgumentException("Value must be from 1 to 13.");
    }

    public String getRankString() {
        return getRankString(this.r);
    }

    /**
     * Get the numerical value of a card in a Blackjack game.
     * @return Value
     */
    public int getBlackjackValue() {
        if (r == 1) {
            return ace ? 1 : 11;
        } else if (r > 10 && r < 14) {
            return 10;
        } else {
            return r;
        }
    }

    /**
     * Switch the ace value between 1 and 11.
     * @return The value of the Ace after the switch
     */
    @Deprecated
    public int switchAce() {
        ace = !ace;
        return ace ? 1 : 11;
    }

    public String toString() { return getRankString(this.r) + s.getSuitSymbol(); }
}
