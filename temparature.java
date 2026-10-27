import java.util.Scanner;
public class temparature {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the temparature in celcius :");
        int n=sc.nextInt();
        double result= (n*9.0)/5+32;
        System.out.println(result);

    }
}
