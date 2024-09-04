package interview_70;

public class BestTimeToBuyAndSellStocks {

    public static void main(String[] args) {

        int[] stock = {7,1,5,3,6,4};
        System.out.println(maxProfit(stock));
        System.out.println(maxProfitTwoPointer(stock));

    }

    public static int maxProfit(int[] stocks){

        int buy = stocks[0];
        int maxProfit = 0;

        for (int i = 0; i < stocks.length; i++) {
            if (stocks[i] < buy){
                buy = stocks[i];
            }
            if (stocks[i] - buy > maxProfit){
                maxProfit = stocks[i] - buy;
            }
        }
        return maxProfit;

    }

    public static int maxProfitTwoPointer(int[] stocks){

        int left = 0;
        int right = 1;
        int maxProfit = 0;
        while (right < stocks.length){
            if (stocks[left] < stocks[right]){
                int profit = stocks[right] - stocks[left];
                maxProfit = Math.max(maxProfit, profit);
            }else{
                left = right;
            }
            right++;
        }
        return maxProfit;
    }

}
