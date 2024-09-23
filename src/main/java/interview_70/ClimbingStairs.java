package interview_70;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {

    public static void main(String[] args) {

        int n = 4;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n){
        Map<Integer, Integer> map = new HashMap<>();
        return climbStairs(n, map);
    }

    public static int climbStairs(int n, Map<Integer, Integer> memo){
        if (n == 1 || n == 0) return 1;
        if (!memo.containsKey(n)){
            memo.put(n, climbStairs(n - 1, memo) + climbStairs(n - 2, memo));
        }
        return memo.get(n);
    }
}
