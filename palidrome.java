import  java.util.Scanner;
public class palidrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num=num1;
        int rev=0;
        while(num>0){
            rev=rev*10+(num%10);
            num=num/10;
        }
        if(rev==num1)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
