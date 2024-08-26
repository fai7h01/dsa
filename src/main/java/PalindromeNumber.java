public class PalindromeNumber {

    public static void main(String[] args) {

        int num = 11211;
        System.out.println(isPalindrome(num));
    }

    public static boolean isPalindrome(int num){

        int temp = num;
        int reversed = 0;

        while(temp != 0){
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return reversed == num;

    }

}
