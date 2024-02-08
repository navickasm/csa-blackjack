package com.macknavickas.blackjack.testers;

import com.macknavickas.cardgame.Card;
import com.macknavickas.cardgame.Suit;

public class CardTester {
    public static void main(String[] args) {
        Card c1 = new Card(Suit.CLUB, 4);
        Card c2 = new Card(Suit.DIAMOND, 12);
        Card c3 = new Card(Suit.SPADE, 1);


        Card c1a = new Card(Suit.CLUB, 4);
        Card c2a = new Card(Suit.DIAMOND, 12);
        Card c3a = new Card(Suit.SPADE, 1);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);


        System.out.println(c3.getBlackjackValue());
        c3.switchAce();
        System.out.println(c3.getBlackjackValue());

        System.out.println(c1.getBlackjackValue());
        System.out.println(c2.getBlackjackValue());
    }
}