package interview_70;

import java.util.Arrays;

public class SquaresOfSortedArray {

    public static void main(String[] args) {

        int[] nums = {-4,-1,0,3,10}; //non-decreasing order
        // output 0,1,9,16,100 -> after square and sorting
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums){

        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        for (int i = res.length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])){
                res[i] = nums[left] * nums[left];
                left++;
            }else{
                res[i] = nums[right] * nums[right];
                right--;
            }
        }
        return res;
    }

}
