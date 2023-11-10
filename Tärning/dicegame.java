import java.util.Scanner;

public class dicegame {
    public static void main (String[] args) {
        Scanner playerInput = new Scanner(System.in);
        boolean replay = true;
        
        System.out.println("Welcome to this simple dicegame! What is your name?");
            String name = playerInput.nextLine();
            Player player = new Player(name);

        while (replay) {

            System.out.println("Okay " + player.getName() + ", how many rounds would you like to play?");
                int rounds = playerInput.nextInt();

            System.out.println("How many sides will the die have?");
                int sides = playerInput.nextInt();

    player.addDie(sides);
        
    System.out.println("Nice, here we go!");

    GameFunctions.gamePlay(player, rounds, sides, playerInput);

    GameFunctions.gameScore(player, rounds);

        while (replay)  {

    System.out.println("Do you want to play again? (yes/no)");
    String playAgain = playerInput.next();

            if (playAgain.equalsIgnoreCase("yes")) {
                player.setPoint();
                break;
                }   else if (playAgain.equalsIgnoreCase("no"))  {
                            replay = false;
                    }   else    {
                                System.out.println("Invalid input. Please enter 'yes' or 'no'");
            }
    }
    }

        System.out.println("Exiting.. Thank you for playing!");
        playerInput.close();
    }
    
}
