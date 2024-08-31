import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {

    public static void main(String[] args) {

        String x = "leetcode";
        System.out.println(longestSubstring(x));
    }

    public static int longestSubstring(String s){

        Set<Character> set = new HashSet<>(); //    t c o d e

        int left = 0, right = 0, max = 0;

        while (right < s.length()){
            char ch = s.charAt(right);
            if (set.add(ch)){
                max = Math.max(max, right - left + 1);
                right++;
            }else{
                set.remove(s.charAt(left++));
            }
        }
        return max;
    }


}
