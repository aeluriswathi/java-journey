import java.util.Arrays;
public class Largestandsmallest {
    static int linear(int x, int[] arr){
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            if (arr[i]==x)
                temp=i;
            else temp=-1;
        }
        return temp;
    }
    public static void main(String[] args){
        int[] ar={43,65,21,14,90};
        int[] arr=ar.clone();
        int largest=arr[0];
        // largest
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        // smallest
        int small=arr[0];
        System.out.println(largest);
        for(int i=1;i<arr.length;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        //reverse
        System.out.println(small);
        int[] copy=new int[5];
        int n= arr.length/2;
        int temp=0;
        for(int i=0;i<=n;i++){
            temp=arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[i];
            arr[i]=temp;

        }
        System.out.println(Arrays.toString(arr));
        //linear search
        int p=65;
        System.out.println(linear(p, arr));
        //count even numbers
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]%2==0)
                sum++;
        }
        System.out.println(sum);

    }
}
