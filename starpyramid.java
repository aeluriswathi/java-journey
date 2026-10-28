import  java.util.Scanner;
public class starpyramid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            System.out.println();
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
        }

    }
}
