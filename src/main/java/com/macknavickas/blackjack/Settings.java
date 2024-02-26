package com.macknavickas.blackjack;

public class Settings {

    private double startingValue;

    private String playerName;

    public Settings(String playerName, double startingValue) {
        this.playerName = playerName;
        this.startingValue = startingValue;
    }

    public double getStartingValue() {
        return startingValue;
    }

    public String getPlayerName() {
        return playerName;
    }
}
