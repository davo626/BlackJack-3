package com.company;

/**
 * Created by falyanguzov on 10.11.2016.
 */
public class Computer extends Player {
    public Computer() {
        this.intellect = new DealerIntellect();
    }
}
