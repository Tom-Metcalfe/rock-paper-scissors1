package com.training.corecom.rockpaperscissors;

import java.util.Scanner;

public abstract class Player {

    private String name;

       public static String getMove() {
        Scanner input = new Scanner(System.in);
        String move = input.nextLine();
        return move;
    }
}
