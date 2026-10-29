import java.util.Arrays;
import java.util.Scanner;
public class secondlargest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array");
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int secondlargest=0;
        int firstlargest=arr[0];
        for(int j=1;j<n;j++){
            if(arr[j]>firstlargest) {
                secondlargest = firstlargest;
                firstlargest = arr[j];
            }
            else if(arr[j]>secondlargest){
                    secondlargest = arr[j];
            }

        }
        System.out.println(secondlargest);
    }
}
