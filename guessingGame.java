import java.util.Random;
import java.util.Scanner;

public class guessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        char play;
    do {
        int maxTries = 7;
        boolean won = false;
        int secret = random.nextInt(100) + 1;   // 1 to 100
        System.out.println("I picked a number from 1 to 100. You have " + maxTries + " tries.");
        int attempt = 1;
        while (attempt <= maxTries) {
            System.out.print("Guess #" + attempt + ": ");
            int guess = sc.nextInt();
            if (guess < 1 || guess > 100) {
                System.out.println("Please enter in between 1 to 100");
                attempt--;
                continue;
            } else if (guess == secret) {
                System.out.println("Correct! You won in " + attempt + " tries.");
                won = true;
                break;
            } else if (guess < secret) {
                System.out.println("Too low. and you have " +
                        (maxTries - attempt) + " tries left");
            } else {
                System.out.println("Too high. and you have  " +
                        (maxTries - attempt) + " tries left");
            }
            attempt++;
        }
        if (!won) {
            System.out.println("Out of tries. The number was " + secret + ".");
        }
            System.out.println("Want to play again? y/n");
            play = sc.next().charAt(0);
         } while(play=='y'||play=='Y') ;
        System.out.println("Thanks for playing");
    }
}
