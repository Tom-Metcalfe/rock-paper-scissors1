package com.training.corecom.rockpaperscissors;

import java.util.Random;

public class OpponentMove {

    public OpponentMove(){

    }

    public static String getMove() {
        String move;
        Random random = new Random();
        int numb = random.nextInt(3);
        if (numb == 0) {
            move = "Rock";
        } else if (numb == 1) {
            move = "Paper";
        } else {
            move = "Scissors";
        }
        return move;
    }


}

