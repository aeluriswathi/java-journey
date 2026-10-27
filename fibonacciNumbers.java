import java.util.Scanner;
public class fibonacciNumbers {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number of fibonacci : ");
        int N= sc.nextInt();
        int result=0;
        int j=1,i=1;
        System.out.print(result+","+ j +",");
        while(j<N-1){
            result=result+i;
            int k=i;
            i=result;
            System.out.print(result+ ",");
            result=k;
            j++;
        }
    }
}
