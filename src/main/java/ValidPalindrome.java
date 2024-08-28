public class ValidPalindrome {

    public static void main(String[] args) {

        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }


    public static boolean isPalindrome(String str){

        int left = 0;
        int right = str.length() - 1;

        while (left <= right){

            char leftChar = str.charAt(left);
            char rightChar = str.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)){
                left++;
            }else if (!Character.isLetterOrDigit(rightChar)){
                right--;
            }else{
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)){
                    return false;
                }
                left++;
                right--;
            }

        }

        return true;
    }
}
