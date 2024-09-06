package interview_70;

public class SingleNumber {

    public static void main(String[] args) {

        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));

    }

    public static int singleNumber(int[] nums){
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }
}
