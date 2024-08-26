import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] numsNotSorted = {21,11,1,5,4};
        int[] numsSorted = {1,4,5,11,21};
        int target = 16;

        System.out.println(Arrays.toString(twoSum1(numsNotSorted, target)));
        System.out.println(Arrays.toString(twoSum2(numsSorted, target)));

    }

    public static int[] twoSum1(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]), i};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }

    public static int[] twoSum2(int[] nums, int target){
        int left = 0, right = nums.length - 1;

        while(left < right){
            if (nums[left] + nums[right] == target){
                return new int[]{left, right};
            }
            if (nums[left] + nums[right] < target){
                left++;
            }else {
                right--;
            }
        }
        return new int[0];
    }
}
