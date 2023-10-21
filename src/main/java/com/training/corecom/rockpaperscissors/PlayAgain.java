package com.training.corecom.rockpaperscissors;

import java.util.Scanner;

public class PlayAgain {
    public static String getChoice() {

        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        return choice;
    }
    public static String getChoiceForTest(){
        String choice = "y";
        return choice;
    }
    public static String getTestString(){
        String string = "Hello, my name is Tom.";
        return string;
    }
}
