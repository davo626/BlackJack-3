package com.company;

/**
 * Created by falyanguzov on 10.11.2016.
 */
public class Human extends Player{
    public Human(String name) {
        super(name, new HumanIntellect());
    }
}
