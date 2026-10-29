import  java.util.Arrays;
public class mul {
    static void changeFirst(int[] arr){
        arr[2]=9;
    }
    public static void main(String[] args){
    int[] nums={100,20,30,40};
    int[] empty=new int[4];
    System.out.println(nums[0]);
    System.out.println(nums.length);
    for (int i=0;i<nums.length;i++){
        System.out.println(nums[i]);
    }
    for(int n:nums){
        System.out.println(n);
    }
    changeFirst(nums);
    System.out.println(Arrays.toString(nums));

    int[] copy=Arrays.copyOf(nums, nums.length);
    Arrays.sort(copy);
    System.out.println(Arrays.toString(copy));

    int[][] grid={{1,2,4},{4,6,2}};
    for(int r=0;r< grid.length;r++){
        for(int p=0;p<grid[r].length;p++){
            System.out.print(grid[r][p]);
        }
    }
    }
}