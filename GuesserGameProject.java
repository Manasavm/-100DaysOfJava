package com.learnings.git;

import java.util.Scanner;

class Guesser{
    public int guess(){
       Scanner in = new Scanner(System.in);
       System.out.print("Guesser please guess the number between 1 to 10: ");
        int guessNumber = in.nextInt();
        if(guessNumber<=10){
            return guessNumber;
        }else{
            System.out.print("Guesser please guess the number within range");
            System.exit(0);
        }
        return Integer.MIN_VALUE;
    }
}
class Players{

    public int playerGuess(){
        Scanner in = new Scanner(System.in);
        System.out.print("Player kindly guess the number between 1 to 10: ");
        int playerguess = in.nextInt();
        if(playerguess<=10) {
            return playerguess;
        }else{
            System.out.println("Out of range! try again");
             }
        return Integer.MIN_VALUE;
    }

}
class CollectsNumber {
    int guesserNumber;
    int numberFromplayer1;
    int numberFromplayer2;
    int numberFromplayer3;
    int numberFromplayer4;
    int numberFromplayer5;

        public void collectNumberFromGuesser() {
            Guesser g = new Guesser();
            guesserNumber = g.guess();
        }
        public void collectNumberFromPlayer() {
            Players p = new Players();
                numberFromplayer1 = p.playerGuess();
                numberFromplayer2 = p.playerGuess();
                numberFromplayer3 = p.playerGuess();
                numberFromplayer4 = p.playerGuess();
                numberFromplayer5 = p.playerGuess();
        }

        public void compare() {
            if(guesserNumber==numberFromplayer1)
            {
                if(guesserNumber==numberFromplayer2 && guesserNumber==numberFromplayer4
                        && guesserNumber==numberFromplayer5 && guesserNumber==numberFromplayer3)
                {
                    System.out.println("Game tied all players guessed correctly");
                }
                else if (guesserNumber == numberFromplayer2 && guesserNumber == numberFromplayer4 &&
                        guesserNumber == numberFromplayer5) {
                    System.out.println("Player 1, Player 2, Player 4 and player 5 won the game");
                }
                else if (guesserNumber == numberFromplayer3 && guesserNumber == numberFromplayer4 &&
                        guesserNumber == numberFromplayer5) {
                    System.out.println("Player 1, Player 3, Player 4 and player 5 won the game");
                }
                else if (guesserNumber == numberFromplayer2 && guesserNumber == numberFromplayer3 )
                {
                    System.out.println("Player 1, Player 2 and Player 3 won the game");
                }
                else if (guesserNumber == numberFromplayer2 && guesserNumber == numberFromplayer4 )
                {
                System.out.println("Player 1, Player 2 and Player 4 won the game");
                }
                else if (guesserNumber == numberFromplayer2 && guesserNumber == numberFromplayer5 )
                {
                    System.out.println("Player 1, Player 2 and Player 5 won the game");
                }
                else if (guesserNumber == numberFromplayer3 && guesserNumber == numberFromplayer4 ) {
                    System.out.println("Player 1, Player 3 and Player 4 won the game");
                }
                else if (guesserNumber == numberFromplayer3 && guesserNumber == numberFromplayer5 ) {
                    System.out.println("Player 1, Player 3 and Player 5 won the game");
                }
                else if (guesserNumber == numberFromplayer4 && guesserNumber == numberFromplayer5) {
                    System.out.println("Player 1, Player 4 and player 5 won the game");
                }
                else if(guesserNumber==numberFromplayer2)
                {
                    System.out.println("Player 1 and Player 2 won the game");
                }
                else if(guesserNumber==numberFromplayer3)
                {
                    System.out.println("Player 1 and Player 3 won the game");
                }
                else if(guesserNumber==numberFromplayer4)
                {
                    System.out.println("Player 1 and Player 4 won the game");
                }
                else if(guesserNumber==numberFromplayer5)
                {
                    System.out.println("Player 1 and Player 5 won the game");
                }
                else
                {
                    System.out.println("Player 1 won the game");
                }
            }


            else if(guesserNumber==numberFromplayer2) {

                    if (guesserNumber == numberFromplayer3&&guesserNumber == numberFromplayer4
                            &&guesserNumber == numberFromplayer5)
                    {
                        System.out.println("Player 2,Player 3,Player 4,Player 5 won the game");
                    }
                    else if (guesserNumber == numberFromplayer3 && guesserNumber == numberFromplayer4)
                    {
                        System.out.println("Player 2, Player 3, Player 4 won the game");
                    }
                    else if (guesserNumber == numberFromplayer3 && guesserNumber == numberFromplayer5)
                    {
                        System.out.println("Player 2, Player 3, Player 5 won the game");
                    }
                    else if (guesserNumber == numberFromplayer4 && guesserNumber == numberFromplayer5)
                    {
                        System.out.println("Player 2, Player 4, Player 5 won the game");
                    }
                     else if (guesserNumber == numberFromplayer3)
                    {
                        System.out.println("Player 2 and Player 3 won the game");
                    }
                    else if (guesserNumber == numberFromplayer4)
                    {
                        System.out.println("Player 2 and Player 4 won the game");
                    }
                    else if (guesserNumber == numberFromplayer5)
                    {
                        System.out.println("Player 2 and Player 5 won the game");
                    }
                    else
                    {
                        System.out.println("Player 2 won the game");
                    }
                    }

            else if(guesserNumber==numberFromplayer3)
            {
                if (guesserNumber == numberFromplayer4 && guesserNumber == numberFromplayer5)
                {
                    System.out.println("Player 3,Player 4 and player 5 won the game");
                }
                else if (guesserNumber == numberFromplayer4)
                {
                    System.out.println("Player 3 and Player 4 won the game");
                }
                else if (guesserNumber == numberFromplayer5)
                {
                    System.out.println("Player 3 and Player 5 won the game");
                }
                else
                {
                    System.out.println("Player 3 won the game");
                }
            }
            else if(guesserNumber==numberFromplayer4)
            {
                if (guesserNumber == numberFromplayer5) {
                    System.out.println("Player 4 and Player 5 won the game");
                }else {
                    System.out.println("Player 4 won the game");
                }
            }
            else if(guesserNumber==numberFromplayer5)
            {
                    System.out.println("Player 5 won the game");
            }
            else
            {
                System.out.println("All Players lost the game! try again");
            }
        }

}
public class GuesserGameProject {
        public static void main(String[] args) {
            System.out.println("===========Hellooooo Guysssss!!!! Welcome to the Guesser Game event==============");
            System.out.println();
        CollectsNumber c= new CollectsNumber();
        for(int i = 1;i<=3;i++) {
            System.out.println("*********** Round Number "+i+" ***********");
            System.out.println();
            c.collectNumberFromGuesser();
            c.collectNumberFromPlayer();
            System.out.println();
            System.out.println("*********** Round "+i+" winners ***********");
            System.out.println();
            c.compare();
            System.out.println();
        }
        }
    }
