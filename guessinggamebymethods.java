import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class guessinggamebymethods {
    static int best = Integer.MAX_VALUE;
    static int pickSecret(){
        return new Random().nextInt(100)+1;
    }
    static int readGuess(Scanner sc, int attempt){
        System.out.println("Guess #" + attempt+":");
        return sc.nextInt();
    }
    static String checkGuess(int guess, int secret){
        if(guess==secret) return  "correct";
        return guess<secret?"low": "high";
    }
    static void playagain(int attempt,Scanner sc,int maxtries){
        System.out.println("want to lay again");
        char a=sc.next().charAt(0);
        if(a=='y' ||a=='Y'){
            playGround(sc,maxtries);
        } else {
            System.out.println("Thankyou for playing");
            if (best == Integer.MAX_VALUE) {
                System.out.println("No games won.");
            } else {
                System.out.println("Best trial count: " + best);
            }
        }
    }
    static boolean playGround(Scanner sc,int maxtries){
        int secret=pickSecret();
        ArrayList<Integer> tries=new ArrayList<>();
        for(int attempt=1;attempt<=maxtries;attempt++){
            int guess=readGuess(sc,attempt);
            tries.add(guess);
            String result=checkGuess(guess, secret);
            if (result.equals("correct")){
                if(best>attempt) {
                    best = attempt;
                }
                System.out.println("You won in "+attempt+" tries");
                System.out.println(tries);
                playagain(attempt,sc,7);
                return true;
            }
            System.out.println("too"+result+".");
        }
        System.out.println("out of tries. the number was "+secret+".");
        System.out.println(tries);
        playagain(7,sc,7);
        return false;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        playGround(sc,7);


    }
}
