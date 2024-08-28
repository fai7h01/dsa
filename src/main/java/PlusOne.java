import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9})));
    }

    public static int[] plusOne(int[] nums){

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 9){
                nums[i]++;
                return nums;
            }
            nums[i] = 0;
        }

        nums = new int[nums.length + 1];
        nums[0] = 1;
        return nums;
    }
}
