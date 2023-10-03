package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String move;

        while(true){
         Random random = new Random();
         int numb = random.nextInt(3);
         String opponentMove;
         if (numb == 0) {
             opponentMove = "Rock";
         } else if (numb == 1) {
             opponentMove = "Paper";
         } else {
         opponentMove = "Scissors";
         }
         System.out.println("Please choose one of the following: Rock (r), Paper(p) or Scissors (s):");
         move = input.nextLine();
            System.out.println("Your opponent chose: " + opponentMove);
         if(move.equals("r") && opponentMove.equals("Scissors") || move.equals("p") && opponentMove.equals("Rock") ||
                 move.equals("s") && opponentMove.equals("Paper")){
             System.out.println("Congratulations! You have won!");}
         else if (move.equals("r") && opponentMove.equals("Paper") || move.equals("p") && opponentMove.equals("Scissors") ||
                 move.equals("s") && opponentMove.equals("Rock")) {
             System.out.println("I'm sorry,you have lost.");}
         else if (move.equals("r") && opponentMove.equals("Rock") || move.equals("p") && opponentMove.equals("Paper") ||
                    move.equals("s") && opponentMove.equals("Scissors")){
             System.out.println("It's a tie!");}
         else{
             System.out.println("I'm sorry, I did not recognise that command.");}

         }
        }

    }
