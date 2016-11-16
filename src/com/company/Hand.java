package com.company;

import java.util.LinkedList;

/**
 * Created by falyanguzov on 10.11.2016.
 */
public class Hand extends LinkedList<Card> {
    public int getScore(){
        int score = 0;
        for(Card c: this)
            score += c.getScore();
        return score;
    }
}
