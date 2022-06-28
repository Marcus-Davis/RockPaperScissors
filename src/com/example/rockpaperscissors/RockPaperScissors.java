package com.example.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

// this application plays rock, paper, scissors with a user
public class RockPaperScissors {
    // user enters rock paper or scissors
    // app picks rock paper or scissors randomly
    // Who wins? is it a tie?
    // How many rounds do you want to play - must be odd number
    // keep score

    String[] rps = {"rock", "paper", "scissors"};
    String computerMove;
    String playerMove;
    String whoWon;

    public RockPaperScissors() {

    }

    public void setComputerMove(String computerMove) {
        this.computerMove = computerMove;
    }

    public void setWhoWon(String whoWon) {
        this.whoWon = whoWon;
    }

    public void setPlayerMove(String playerMove) {
        this.playerMove = playerMove;
    }

    // computer choices rock, paper, or scissors
    public String getComputerMove(){
        Random random = new Random();
        computerMove = rps[new Random().nextInt(rps.length)];
        System.out.println(computerMove);
        return computerMove;
    }

    public String getWhoWon(String playerMove){
        // computer chooses rock (0) - wins if scissors (2) is entered
        // computer chooses paper (1) - wins if rock (0) is entered
        // computer chooses scissors (2) - wins if paper (1) is entered
       if (computerMove.equalsIgnoreCase(playerMove)){
           System.out.println("its a tie");
       } else if (computerMove.equalsIgnoreCase("rock")) {
           if (playerMove.equalsIgnoreCase("scissors")){
               System.out.println("Computer wins");
           } else if (playerMove.equalsIgnoreCase("paper")) {
               System.out.println("You win!");
           }
       } else if (computerMove.equalsIgnoreCase("paper")) {
           if (playerMove.equalsIgnoreCase("rock")){
               System.out.println("Computer wins");
           } else if (playerMove.equalsIgnoreCase("scissors")) {
               System.out.println("You win!");
           }
       } else if (computerMove.equalsIgnoreCase("scissors")) {
           if (playerMove.equalsIgnoreCase("paper")){
               System.out.println("Computer wins");
           } else if (playerMove.equalsIgnoreCase("rock")) {
               System.out.println("You win!");
           }
       }
        return whoWon;
    }

    public static void main(String[] args) {
        // computer object
        RockPaperScissors computer = new RockPaperScissors();
        RockPaperScissors player = new RockPaperScissors();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ready to play? \nHow many rounds would you like to play? (Enter an odd number)");

        while (true) {
            System.out.println("Rock, paper, scissors SHOOT!:");
            // user enters their choice
            String userInput = scanner.nextLine();
            // computer randomly chooses rock, paper or scissor
            computer.getComputerMove();
            // who wins?
            computer.getWhoWon(userInput);

            System.out.println("Play again? Yes or No");
            String playAgain = scanner.nextLine();
            if (!playAgain.equalsIgnoreCase("yes")){
                break;
            }
        }
        // show score


        //System.out.println(Arrays.toString(pickOne));
    }

}

