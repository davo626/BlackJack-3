package com.company;

/**
 * Created by falyanguzov on 10.11.2016.
 */
public class Player {
    Hand hand = new Hand();
    Intellect intellect;

    public void take(Card current) {
        this.hand.add(current);
    }

    public Command commands() {
        return this.intellect.think(this.hand.getScore());
    }
}
