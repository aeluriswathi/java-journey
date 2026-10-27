import java.util.Scanner;
public class evenOrOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("even number");
        }else {
            System.out.println("Odd number");
        }
    }
}
