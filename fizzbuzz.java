import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class fizzbuzz {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<String> fin =new ArrayList<>();
        String[] res=new String[n];
        for (int i=1; i<=n; i++) {
        /*    if(i>1){
                System.out.print(",");
            }*/
            if (i % 3 == 0 && i % 5 == 0) {
                fin.add("FizzBuzz");
               // res[i-1]="FizzBuzz";
            }
            else if (i % 3 == 0 ) {
                fin.add("Fizz");
                //res[i-1]="Fizz";
            }
            else  if (i%5==0){
                fin.add("Buzz");
                //res[i-1]="Buzz";
            }
            else
                fin.add(String.valueOf(i));
               // res[i-1]=String.valueOf(i);
           // System.out.print('"'+res[i-1]+'"');
        }
        System.out.print(fin);
    }
}
