import java.util.Random;
import java.util.Scanner;
public class Guessingno {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        while(true) {
        System.out.println("Enter your guess (1-100):");
        Scanner Sc = new Scanner(System.in);
        int playerGuess = Sc.nextInt();
        if (playerGuess == randomNumber) {
            System.out.println("Correct! you Win!");
            break;
        }
        else if(randomNumber > playerGuess) {
            System.out.println("Nope! The number is higher. Guess again!");
        }
        else {
            System.out.println("Nope! The number is lower.Guess again!");
        }




    }
    }