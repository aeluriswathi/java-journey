import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=String.valueOf(num).length();
        int result=num;
        int res=0;
        for(int i=1;i<=n;i++){
            res+= result%10;
            result=result/10;

        }
        System.out.println(res);
    }
}
