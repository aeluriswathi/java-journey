import java.util.Arrays;
import java.util.Scanner;
public class runningsum {
    public static void main(String[] args){
       // int[] arr={1,2,3,4};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array length");
        int l=sc.nextInt();
        System.out.println("enter the values of array");
        int[] arr=new int[l];
        for(int i=0; i<l;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        System.out.println(Arrays.toString(arr));

    }
}
