package com.xworkz.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GameNames {
    public static void main(String[] args) {
        Collection<String> actionGames = new ArrayList<>();
        actionGames.add("Call of Duty");
        actionGames.add("Grand Theft Auto");
        actionGames.add("Fortnite");
        actionGames.add("Halo");
        actionGames.add("Gears of War");

        Collection<String> adventureGames = new ArrayList<>();
        adventureGames.add("The Legend of Zelda");
        adventureGames.add("Uncharted");
        adventureGames.add("Assassin's Creed");
        adventureGames.add("Tomb Raider");
        adventureGames.add("Red Dead Redemption");

        Collection<String> puzzleGames = new ArrayList<>();
        puzzleGames.add("Tetris");
        puzzleGames.add("Candy Crush");
        puzzleGames.add("Bejeweled");
        puzzleGames.add("Portal");
        puzzleGames.add("Monument Valley");

        Collection<String> sportsGames = new ArrayList<>();
        sportsGames.add("FIFA");
        sportsGames.add("NBA 2K");
        sportsGames.add("Madden NFL");
        sportsGames.add("Tony Hawk's Pro Skater");
        sportsGames.add("Rocket League");

        Collection<String> rpgGames = new ArrayList<>();
        rpgGames.add("The Witcher");
        rpgGames.add("Final Fantasy");
        rpgGames.add("Elder Scrolls");
        rpgGames.add("Dark Souls");
        rpgGames.add("Dragon Age");

        actionGames.addAll(rpgGames);

        actionGames.remove("Fortnite");

        adventureGames.clear();

        boolean isAvailable = rpgGames.contains("The Witcher");
        System.out.println("Is The Witcher in RPG games? " + isAvailable);

        boolean isItContainsAll = actionGames.containsAll(rpgGames);
        System.out.println("Does actionGames contain all RPG games? " + isItContainsAll);

        System.out.println("Number of games in sportsGames: " + sportsGames.size());


        System.out.println("RPG Games:");
        Iterator<String> itr = rpgGames.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}