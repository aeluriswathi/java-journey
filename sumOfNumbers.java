import java.util.Scanner;
public class sumOfNumbers {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number N :");
        int N= sc.nextInt();
        int result=0;
        for(int i=1;i<=N;i++){
            result=result+i;
        }
        System.out.println("Sum of first " + N + "numbers = " + result);
    }
}
