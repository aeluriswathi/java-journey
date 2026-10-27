import java.util.Scanner;
public class Greeter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print(" Enter your age : ");
        int age=sc.nextInt();
        System.out.print("enter your name: " );
        String name=sc.nextLine();


        System.out.println("Hi "+ name + ", you will be " + (age+1) + " next year.");
    }
}
