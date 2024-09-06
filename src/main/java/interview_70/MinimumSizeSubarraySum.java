package interview_70;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.min;

public class MinimumSizeSubarraySum {

    public static void main(String[] args) {

        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        //output: 2
        System.out.println(minSubarraySum(target, nums));
    }

    public static int minSubarraySum(int target, int[] nums){
        int left = 0;
        int currentSum = 0;
        int minLength = MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];
            while (currentSum >= target){
                minLength = min(minLength, right - left + 1);
                currentSum -= nums[left++];
            }
        }
        return minLength == MAX_VALUE ? 0 : minLength;
    }

}
