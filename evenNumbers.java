import  java.util.Scanner;
public class evenNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter the last number to pick even numbers:");
        int N=sc.nextInt();
        for(int i=1; i<=N;i++){
            if (i%2==0)
                System.out.println(i);
        }
    }
}
