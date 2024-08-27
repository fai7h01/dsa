public class IntegerToRoman {

    public static void main(String[] args) {

        System.out.println(convertIntegerToRoman(20));

    }

    public static String convertIntegerToRoman(int num) {

        int[] n = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] s = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();
        int index = 0;
        while (num > 0){
            if (num >= n[index]){
                result.append(s[index]);
                num -= n[index];
            }else{
                index++;
            }
        }

        return result.toString();
    }

}
