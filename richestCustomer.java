import java.util.Arrays;
import java.util.Scanner;
public class richestCustomer {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("dimentions of array");
        int p=sc.nextInt();
        int q=sc.nextInt();
        int[][] accounts =new int[p][q];
        System.out.println("enter the information: ");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                accounts[i][j]=sc.nextInt();
            }
        }
        // 1 2 3 4
        // 1 2 4 5
        int person=0;
        int temp=0;
        for(int a=0;a<p;a++){
            int sum=0;
            for(int b=0;b<q;b++){
                sum+=accounts[a][b];
            }
            if (sum>temp) {
                temp = sum;
                person=a;
            }

        }
       System.out.println(temp+" rishest person "+ (person+1));

    }
}
