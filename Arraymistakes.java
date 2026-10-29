import java.util.Arrays;
public class Arraymistakes {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 6, 3};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println(nums);
        System.out.println(Arrays.toString(nums));
        int[] b=nums;
        b[0]=67;
        System.out.println(nums[0]);
        System.out.println(b[0]);

    }
}
