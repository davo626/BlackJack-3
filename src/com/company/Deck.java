package com.company;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by falyanguzov on 10.11.2016.
 */
public class Deck extends LinkedList<Card> {
    public Deck() {
        for(Suit s: Suit.values())
            for(Value v: Value.values())
                this.add(new Card(s, v));
        Collections.shuffle(this);
    }
}
