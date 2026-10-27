import java.util.Scanner;
public class secondstohoursminutes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the time seconds :");
        int n=sc.nextInt();
        int sec=n%60;
        int min=(n/60)%60;
        int hour=n/3600;
        System.out.println(hour+" hour : "+min+" min : "+sec+" sec");
    }
}
