import  java.util.Scanner;
public class largestofthree {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the numbers:");
        int p=sc.nextInt();
        int q=sc.nextInt();
        int r=sc.nextInt();
      /*  if (p >q && p>r)
            System.out.println("largest number is" + p);
        else if (q>r)
            System.out.println("largest number is "+ q);
        else
            System.out.println("largest number is"+r);*/
        System.out.println(Math.max(p, Math.max(q,r)));
    }
}
