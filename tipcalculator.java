import  java.util.Scanner;
public class tipcalculator {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter bill :");
        double bill=sc.nextDouble();
        System.out.print("enter tip percentage :");
        int tipPercent=sc.nextInt();
        System.out.print("enter people to share :");
        int persons=sc.nextInt();

        double tip= bill * tipPercent /100;
        double total= bill + tip;
        double perPerson=total/persons;
        System.out.println("bill =" + total);
        System.out.println("tip =" + tip);
        System.out.println(" each person's pay =" + perPerson);
    }

}
