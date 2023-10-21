package com.training.corecom.rockpaperscissors;

public class RockPaperScissorsGame implements Game {

    public static void main(String[] args) {

        String move;
        int score = 0;

        while (score == 0) {
            String opponentMove = OpponentMove.getMove();
            System.out.println("Please choose one of the following: Rock (r), Paper(p) or Scissors (s):");
            move = Player.getMove();
            System.out.println("Your opponent chose: " + opponentMove);
            if (move.equals("r") && opponentMove.equals("Scissors") || move.equals("p") && opponentMove.equals("Rock") ||
                    move.equals("s") && opponentMove.equals("Paper")) {
                System.out.println("Congratulations! You have won!");
                break;


            } else if (move.equals("r") && opponentMove.equals("Paper") || move.equals("p") && opponentMove.equals("Scissors") ||
                    move.equals("s") && opponentMove.equals("Rock")) {
                System.out.println("I'm sorry,you have lost.");
                break;


            } else if (move.equals("r") && opponentMove.equals("Rock") || move.equals("p") && opponentMove.equals("Paper") ||
                    move.equals("s") && opponentMove.equals("Scissors")) {
                System.out.println("It's a tie!");


            } else {
                System.out.println("I'm sorry, I did not recognise that command.");

            }
            System.out.println("Would you like to play again?PLease type Yes (y) or No (n).");
            String choice = PlayAgain.getChoice();
            if (choice.equals("y")) {

            } else {
                System.out.println("Thank you for playing.");
                break;

            }



        }
    }

    @Override
    public void playGame(Player user) {

    }
}
