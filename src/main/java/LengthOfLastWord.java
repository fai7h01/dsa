public class LengthOfLastWord {

    public static void main(String[] args) {

        String s = "Hello World  ";
        System.out.println(lengthOfLast(s));
        System.out.println(lengthOfLast2(s));

    }

    public static int lengthOfLast(String s) {
        s = s.trim();
        return s.substring(s.lastIndexOf(' ') + 1).length();
    }

    public static int lengthOfLast2(String s){ // less memory
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' '){
            end--;
        }
        int start = end;
        while (start >= 0 && s.charAt(start) != ' '){
            start--;
        }
        return end - start;
    }
}
