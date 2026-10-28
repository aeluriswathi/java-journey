import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        while(num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.println(rev);

      /*  int n=String.valueOf(num).length();
        int fin=0;
        for(int i=n;i>0;i--){
           int  res= num%10;
            num=num/10;
            int k=i-1;
            fin+=(int)Math.pow(10,k)*res;
        }
        System.out.println(fin);*/
    }
}
