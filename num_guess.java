import java.util.Random;
import java.util.Scanner;
public class num_guess {
    public static void main(String[] args) {
        Random NumberGenerated = new Random();
        int Correctguess = NumberGenerated.nextInt(15);
        int NumberTried = 0;
        int NumberGuessed;
        int Max_Attempts = 10; 

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String user = scanner.nextLine();

        while (user.length() == 0) {
            System.out.println("Please enter your name:");
            user = scanner.nextLine();
        };

        System.out.println("Hello " + user + "! Welcome to the guessing game."); 

        for (int i = 1; i <= Max_Attempts; i++) {
            System.out.println("Guess a number between 0 and 15:");
            NumberGuessed = scanner.nextInt();
            NumberTried++;

            if (NumberGuessed == Correctguess) {
                System.out.println(
                        "Congratulations " + user + "! You have successfully guessed the correct number in " + NumberTried + " attempt(s)");
                break;
            } else if ( NumberGuessed < Correctguess) {
                System.out.println("Your guess is too low");
            } else {
                System.out.println("Your guess is too high");
            }
            
            if (i == Max_Attempts) {
                System.out.println("Sorry, " + user + ", you didn't guess the number in " + Max_Attempts
                        + " attempts. The correct number was " + Correctguess);
            }
        }
        
        System.out.println("Thank you for playing");

        scanner.close();
    }

}