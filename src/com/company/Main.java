package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        List<Player> players = new LinkedList<Player>();

        players.add(new Computer());
        players.add(new Computer());
        players.add(new Computer());
        players.add(new Human());
        players.add(dealer);

        for(Player player: players){
            dealer.deal(player);
            dealer.deal(player);
        }

        for(Player player: players){
            Command command;
            do{
                System.out.println("" + player.hand.getScore() + ": " +player.hand);
                command = player.commands();
                switch (command) {
                    case HIT:
                        dealer.deal(player);
                        break;
                }
            }while(command!=Command.STAND);
        }

    }
}
