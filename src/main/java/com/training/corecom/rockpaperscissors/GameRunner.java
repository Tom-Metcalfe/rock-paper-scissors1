package com.training.corecom.rockpaperscissors;

public class GameRunner {

    private final Player user;

    public GameRunner(Player user){
        this.user = user;
    }

    public void runGame(Game game){
        game.playGame(user);
    }

}
