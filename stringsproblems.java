import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;
import java.util.Arrays;
public class stringsproblems {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sting :");
        String sname=sc.nextLine();
        char[] name =sname.toCharArray();
        int n=sname.length()/2;
        char temp;
        int num=sname.length()-1;
        // reversing
        for (int i=0;i<n;i++){
            temp=name[i];
            name[i]=name[num-i];
            name[num-i]=temp;
        }
        String s=new String(name);
        System.out.println(s);

        // using string builder we modify the same string

        StringBuilder newName=new StringBuilder(sname);
     /*   for(int j=0; j<n;j++) {
            temp = newName.charAt(j);
            newName.setCharAt(j, newName.charAt(num-j));
            newName.setCharAt(num-j, temp);
        } */
        newName.reverse();

        System.out.println(newName);
        // reverse any string into new string.
        String reverse=new StringBuilder(sname).reverse().toString();
        if(sname.equals(reverse))
            System.out.println("palindrome"+reverse);
        else
            System.out.println("not palindrome"+reverse);

        // System.out.println(newName);

        //palindrome
        boolean con=false;
        for(int k=0;k<n;k++){
            if(newName.charAt(k)==newName.charAt(num-k)){
                con=true;
            }else {
                con=false;
                break;
            }
        }
        if(con==true)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");


    }
}
