import java.util.Scanner;
public class LoopPractice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the numbers to print");
        int number=sc.nextInt();
        //for (int i=1;i<=number;i++){

      //      System.out.println(i);
     //   }
        int j=1;
        while(j <= number){
            System.out.println(j);
            j++;
        }
    }
}
