import java.util.Scanner;
public class multiplication {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter the table :");
        int N=sc.nextInt();
        for( int i=1; i<=10 ;i++){
            int result=N*i;
            System.out.println(N + "X" + i + "=" + result);
        }
    }
}
