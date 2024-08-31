import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MissingNumber {

    public static void main(String[] args) {

        int[] nums = {4,0,1,2};
        System.out.println(missingNum(nums));
    }


    public static int missingNum(int[] nums){

        int actualSum = IntStream.of(nums).sum();
        int expectedSum = IntStream.rangeClosed(0, nums.length).sum();
        return expectedSum - actualSum;

    }
}
