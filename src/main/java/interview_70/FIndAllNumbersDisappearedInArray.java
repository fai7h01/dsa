package interview_70;

import java.util.*;
import java.util.stream.IntStream;

public class FIndAllNumbersDisappearedInArray {

    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};
        // all nums in range(0,nums.length)
        //find missing numbers
        System.out.println(findDisappearedNumbers(nums));
        System.out.println(findDisappearedNumbers2(nums));
    }


    public static List<Integer> findDisappearedNumbers(int[] nums){
        List<Integer> missing = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Arrays.stream(nums).forEach(set::add);
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) missing.add(i);
        }
        return missing;
    }

    public static List<Integer> findDisappearedNumbers2(int[] nums){
        Set<Integer> set = new HashSet<>();
        Arrays.stream(nums).forEach(set::add);
        return IntStream.range(1, nums.length).filter(n -> !set.contains(n)).boxed().toList();
    }

}
