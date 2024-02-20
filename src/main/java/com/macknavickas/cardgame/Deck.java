package com.macknavickas.cardgame;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private final ArrayList<Card> deck;

    private int initialNumDecks;

    /**
     * Create a new deck of 52 different cards.
     */
    public Deck() {
        this(1);
    }

    /**
     * Create a new deck of numberDecks number of decks.
     * @param numberDecks Number of default decks to be added
     */
    public Deck(int numberDecks) {
        initialNumDecks = numberDecks;

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

    public Deck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    /**
     * Shuffles the deck.
     */
    public void simpleShuffle() { Collections.shuffle(deck); }

    // TODO implement method
    /**
     * Shuffles the deck using physics principles
     */
    public void shuffle() {
        this.simpleShuffle();
//        Deck d1 = cutDeck()[0];
//        Deck d2 = cutDeck()[1];
//
//        for (int i = 0; i < deck.size(); i++) {
//            if (i % 2 == 0) { deck.set(i, d1.getDeck().get(i / 2)); }
//            else { deck.set(i, d1.getDeck().get(i / 2)); }
//        }
    }

    public void reshuffle() {
        for (int i = 0; i < initialNumDecks; i++) {
            for (Suit s : Suit.values()) {
                for (int v = 1; v <= 13; v++) {
                    Card card = new Card(s, v);
                    deck.add(card);
                }
            }
        }

        shuffle();
    }

    /**
     * Add a deck to the end of this deck. Clears the original deck.
     * @param d The deck to add.
     */
    public void addDeck(Deck d) {
        deck.addAll(d.getDeck());
        d.clearDeck();
    }

    // TODO implement method
    public void shuffleInDeck() {}

    /**
     * @return The ArrayList representing the deck.
     */
    public ArrayList<Card> getDeck() { return deck; }

    /**
     * @return The number of cards in the current deck
     */
    public int getSize() { return deck.size(); }

    private Deck[] cutDeck() {
        int deckLength = this.deck.size() / 2;

        Deck d1 = new Deck((ArrayList<Card>) deck.subList(0,deckLength));
        Deck d2 = new Deck((ArrayList<Card>) deck.subList(deckLength + 1, deck.size() - 1));

        return new Deck[]{d1, d2};
    }

    /**
     * Draw a single card from the deck.
     * @return The card removed from the deck.
     */
    public Card draw() {
        return deck.remove(0);
    }

    /**
     * Add a card to the end of the deck.
     * @param c The card to add
     */
    public void addCard(Card c) {
        deck.add(c);
    }

    public int getInitialNumDecks() { return initialNumDecks; }

    public void clearDeck() {
        deck.clear();
    }

    public String toString() {
        return deck.toString();
    }
}
