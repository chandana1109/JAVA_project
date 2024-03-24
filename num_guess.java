import java.io.*;
import java.util.*;

public class num_guess {
    public static void main(String[] args) {
        Random NumberGenerated = new Random();
        int Correctguess = NumberGenerated.nextInt(20);
        int NumberTried = 0;
        int Max_Attempts = 10;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = sc.nextLine();

        while (name.length() == 0) {
            System.out.println("Please enter your name:");
            name = sc.nextLine();
        }
        ;

        System.out.println("Hello " + name + "! Welcome to the Number guessing game.");

        for (int i = 1; i <= Max_Attempts; i++) {
            System.out.println("Guess a number between 0 and 20:");
            int NumberGuessed = sc.nextInt();
            NumberTried++;

            if (NumberGuessed == Correctguess) {
                System.out.println(
                        "Congratulations " + name + "! You have successfully guessed the correct number in "
                                + NumberTried + " attempt(s)");
                break;
            } else if (NumberGuessed < Correctguess) {
                System.out.println("Your guess is too low");
            } else {
                System.out.println("Your guess is too high");
            }

            if (i == Max_Attempts) {
                System.out.println("Sorry, " + name + ", you didn't guess the number in " + Max_Attempts
                        + " attempts. The correct number was " + Correctguess);
            }
        }

        System.out.println("Thank you for playing");
    }

}