import java.util.Random;
import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Random rand = new Random();
        int correctGuess = rand.nextInt(10);
        System.out.println("Type in a digit to guess(0-9)");
        Scanner input = new Scanner(System.in);
        int playerGuess = Integer.parseInt(input.nextLine());
        if (playerGuess == correctGuess){
            System.out.println("Well Done, you've guessed correctly");

        } else if (playerGuess > correctGuess) {
            System.out.println("Your guess is too high! The actual value is " + correctGuess);
        } else {
            System.out.println("Your guess is too low! Correct number is " + correctGuess);
        }


    }
}
