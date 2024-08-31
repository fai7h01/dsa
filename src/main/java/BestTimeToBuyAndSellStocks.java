public class BestTimeToBuyAndSellStocks {

    public static void main(String[] args) {

        int[] stocks = {7,1,5,3,6,4};

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

}
