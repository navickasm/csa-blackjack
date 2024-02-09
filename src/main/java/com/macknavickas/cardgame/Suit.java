package com.macknavickas.cardgame;

public enum Suit {
    SPADE("♠"),
    HEART("♥"),
    CLUB("♣"),
    DIAMOND("♦");


    private final String suitSymbol;

    Suit(String suitSymbol) {
        this.suitSymbol = suitSymbol;
    }

    public String getSuitSymbol() {
        return suitSymbol;
    }
}
