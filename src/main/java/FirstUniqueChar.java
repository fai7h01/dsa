import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar { // using arr

    public static void main(String[] args) {

        String s = "leetcode";
        System.out.println(firstUniqueChar(s));
        System.out.println(firstUniqueCharOptimized(s));

    }

    public static int firstUniqueChar(String s){
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }


    public static int firstUniqueCharOptimized(String s){

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[s.charAt(i) - 'a'] == 1) return i;
        }

        return -1;

    }

}
