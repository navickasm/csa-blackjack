package com.macknavickas.card;

public enum Suit {
    HEART("♥"),
    CLUB("♣"),
    DIAMOND("♦"),
    SPADE("♠");

    private final String suitSymbol;

    Suit(String suitSymbol) {
        this.suitSymbol = suitSymbol;
    }

    public String getSuitSymbol() {
        return suitSymbol;
    }
}
