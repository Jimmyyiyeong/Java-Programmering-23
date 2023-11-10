import java.util.InputMismatchException;
import java.util.Scanner;

public class GameFunctions {

    // public static void gameScore(Player player, int rounds)  {

    //     System.out.println("");
    //     System.out.println("Calculating results..");
    //     System.out.println("");

    //     if (player.getPoint() < 0.5*rounds)   {
    //             System.out.println("Result: " + player.getPoint() + " out of possible " + rounds + "! Better luck next time.");
    //     }   else if (player.getPoint() == rounds)   {
    //             System.out.println("Result: " + player.getPoint() + " out of possible " + rounds + "! Wow, you are amazing!");
    //         }   else    {
    //                 System.out.println("Result: " + player.getPoint() + " out of possible " + rounds + "! Pretty good!");
    //             }
    //     System.out.println("");
    // }


    public static void gamePlay(Player player, int rounds, int sides, Scanner playerInput) {

        for (int i=1; i <= rounds; i++) {

            while (true)    {

                try {
                    System.out.println("Round " + i + " of " + rounds + ". Guess a number (between 1 and " + sides + ").");
                    player.setGuess(playerInput.nextInt());

                    if (player.getGuess() <= 0 || player.getGuess() > sides) {
                        System.out.println("You guessed a number less or greater than number of sides, try again!");
                        continue;
                    }
                        break;
                }   
                catch(InputMismatchException ex) {
                        System.out.println("Invalid input, try again.");
                        playerInput.next(); 
                }
            }
            player.rollDice();

            GameFunctions.guessEvaluation(player);
        }
    }
    
    public static void guessEvaluation(Player player)   {

        if (player.getGuess() == player.getDieValue()) {
                System.out.println("Correct! :D");
                player.increaseScore();
        }   else    {
                System.out.println("Wrong! :(");
            }
    }
        
    public static void gameScore(Player player, int rounds)  {

        System.out.println("");
        System.out.println("Calculating results..");
        System.out.println("");

        if (player.getPoint() < 0.5*rounds)   {
                System.out.println("Result: " + player.getPoint() + " out of possible " + rounds + "! Better luck next time.");
        }   else if (player.getPoint() == rounds)   {
                System.out.println("Result: " + player.getPoint() + " out of possible " + rounds + "! Wow, you are amazing!");
            }   else    {
                    System.out.println("Result: " + player.getPoint() + " out of possible " + rounds + "! Pretty good!");
                }
        System.out.println("");
    }

}
