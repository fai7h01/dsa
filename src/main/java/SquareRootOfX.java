public class SquareRootOfX {

    public static void main(String[] args) {

        System.out.println(sqrt(16));

    }

    public static int sqrt(int x){
        if (x == 0 || x == 1) return x;

        int start = 1;
        int end = x;
        int mid = -1;

        while(start <= end){
            // Calculate the middle point using "start + (end - start) / 2" to avoid integer overflow.
            mid = start + (end - start) / 2;
            // If the square of the middle value is greater than x, move the "end" to the left (mid - 1).
            if((long) mid * (long) mid > x){
                end = mid - 1;
            } else if (mid * mid == x) {
                return mid;
            }else{
                start = mid + 1;
            }
        }
        return Math.round(end);
    }

}
