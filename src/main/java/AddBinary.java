public class AddBinary {

    public static void main(String[] args) {

        String a = "1011";
        String b = "1011";
        //              10110
        System.out.println(addBinary(a,b));

        /*
        sum: 1 + 1 = 2 -> in decimal
        result digit in binary = sum % 2 = 2 % 2 = 0
        carry = 2 / 2 = 1
         */
    }

    public static String addBinary(String a, String b){

       StringBuilder sb = new StringBuilder();
       int i = a.length() - 1;
       int j = b.length() - 1;
       int carry = 0;

       while(i >= 0 || j >= 0 || carry == 1){
           if (i >= 0) carry += a.charAt(i--) - '0';
           if (j >= 0) carry += b.charAt(j--) - '0';
           sb.append(carry % 2);
           carry /= 2;
       }

       return sb.reverse().toString();
    }

}
