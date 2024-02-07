package com.macknavickas.card;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;

    /**
     * Create a new deck of 52 different cards.
     */
    public Deck() {
        this(1);
    }

    /**
     * Create a new deck of numberDecks number of decks.
     * @param numberDecks
     */
    public Deck(int numberDecks) {
        deck = new ArrayList<>();
        for (int i = 0; i < numberDecks; i++) {
            for (Suit s : Suit.values()) {
                for (int v = 1; v <= 13; v++) {
                    Card card = new Card(s, v);
                    deck.add(card);
                }
            }
        }
    }

    /**
     * Shuffles the deck.
     */
    public void shuffle() { Collections.shuffle(deck); }

    /**
     * Add a deck to the end of this deck. Clears the original deck.
     * @param d The deck to add.
     */
    public void addDeck(Deck d) {
        for (Card c : d.getDeck()) {
            deck.add(c);
        }
        d.getDeck().clear();
    }

    // TODO implement method
    public void shuffleInDeck() {}

    /**
     * @return The ArrayList representing the deck.
     */
    public ArrayList<Card> getDeck() { return deck; }

    /**
     * Draw a single card from the deck.
     * @return The card removed from the deck.
     */
    public Card draw() {
        return deck.remove(deck.size() - 1);
    }

    public String toString() {
        return deck.toString();
    }
}
