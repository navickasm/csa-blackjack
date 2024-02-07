package com.macknavickas;

import com.macknavickas.card.Card;
import com.macknavickas.card.Deck;
import com.macknavickas.card.Suit;

public class Main {
    public static void main(String[] args) {
        Card c1 = new Card(Suit.CLUB, 4);
        Card c2 = new Card(Suit.DIAMOND, 12);
        System.out.println(c1 + "\n" + c2);

        Deck d1 = new Deck();
        System.out.println(d1);

        Deck d2 = new Deck(0);
        System.out.println(d2);

        d2.addDeck(d1);

        System.out.println(d1);
        System.out.println(d2);


    }
}