package interview_70;

import java.util.*;

public class HowManyNumsAreSmallerThanCurrentNumInArray {

    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        // ans: [4,0,1,1,3]
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] copy = nums.clone();
        Arrays.sort(copy);
        Map<Integer,Integer> map = new HashMap<>();
       // IntStream.range(0, nums.length).forEach(i -> map.putIfAbsent(copy[i], i));
        for (int i = 0; i < copy.length; i++) {
            map.putIfAbsent(copy[i],i);
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = map.get(nums[i]);
        }
        return res;
    }

}
