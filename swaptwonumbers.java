
import java.util.Scanner;
public class swaptwonumbers {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int n1 = sc.nextInt();
        int n2=sc.nextInt();
        //int result=n1;
       // n1=n2;
       // n2=result;
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println(n1+","+ n2);
        System.out.println(0.1+0.2);

    }
}
