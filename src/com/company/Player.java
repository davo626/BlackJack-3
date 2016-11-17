package com.company;

/**
 * Created by falyanguzov on 10.11.2016.
 */
public class Player {
    Hand hand = new Hand();
    Intellect intellect;
    public PlayerState state;
    String name;

    public Player(String name, Intellect intellect) {
        this.intellect = intellect;
        this.name = name;
    }

    public void take(Card current) {
        this.hand.add(current);
    }

    public Command commands() {
        return this.intellect.think(this.hand.getScore());
    }
}
