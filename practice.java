import java.util.Arrays;
import java.util.Scanner;
public class practice {
    static  int sumArray(int[] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    static void reverse(int[] arr){
        int l=arr.length/2;
        int temp=0;
        for(int i=0;i<l;i++){
            temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
       // Scanner sc=new Scanner((System.in));
     //   int n=sc.nextInt();
     //   int[] arr=new int[n];
   //     for(int i=0; i<n;i++){
     //       arr[i]=sc.nextInt();
    //    }
      //  int x=sumArray(arr);
        //System.out.println("sum of ayyay: "+x);
      //  reverse(arr);

                String s = "  Hello, Java World  ";

                System.out.println(s.length());              // 21
                System.out.println(s.trim());                // "Hello, Java World"
                String t = s.trim();
                System.out.println(t.charAt(0));             // H
                System.out.println(t.substring(7));          // Java World
                System.out.println(t.substring(7, 11));      // Java
                System.out.println(t.indexOf("Java"));       // 7
                System.out.println(t.indexOf("xyz"));        // -1 (not found)
                System.out.println(t.toUpperCase());
                System.out.println(t.toLowerCase());
                System.out.println(t.replace("Java", "Python"));
                System.out.println(t.contains("World"));     // true
                System.out.println(t.startsWith("Hello"));   // true
                System.out.println(t.isEmpty());             // false

                // Immutability: s is NOT changed by these calls
                t.toUpperCase();
                System.out.println(t);                       // still "Hello, Java World"

                // split
                String[] words = "apple,banana,cherry".split(",");
                for (String w : words) {
                    System.out.println(w);
                }

                // Looping through characters
                for (int i = 0; i < t.length(); i++) {
                    System.out.print(t.charAt(i) + "|");
                }
                System.out.println();
            }
        }
