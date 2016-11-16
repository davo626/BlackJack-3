package com.company;

/**
 * Created by falyanguzov on 16.11.2016.
 */
public class LimitIntellect extends Intellect {
    private int limit;

    public LimitIntellect(int limit) {
        this.limit = limit;
    }

    @Override
    public Command think(int score) {
        if(score>=this.limit){
            return Command.STAND;
        }else{
            return Command.HIT;
        }
    }
}
