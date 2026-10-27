import  java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the radius of the circle:");
        int r=sc.nextInt();
        System.out.print(Math.PI*r*r);
    }
}
