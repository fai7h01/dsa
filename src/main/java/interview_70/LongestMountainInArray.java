package interview_70;

public class LongestMountainInArray {

    public static void main(String[] args) {

        int[] arr = {2,1,4,7,3,2,5};
        //output: 5
        System.out.println(longestMountain(arr));
    }

    public static int longestMountain(int[] arr){

        int maxLength = 0;
        int left = 0;
        int right = 0;

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]){
                left = right = i;
                while (left > 0 && arr[left - 1] < arr[left]){
                    left--;
                }
                while (right < arr.length - 1 && arr[right + 1] < arr[right]){
                    right++;
                }
            }
            int currentLength = right - left + 1;
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;

    }
}
