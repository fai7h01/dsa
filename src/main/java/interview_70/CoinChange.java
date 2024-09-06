package interview_70;

import java.util.Arrays;

public class CoinChange {

    public static void main(String[] args) {

        int[] coins = {1,2,5};
        int amount = 5;
        System.out.println(coinChange(coins, amount));

    }

    public static int coinChange(int[] coins, int amount){
       int[] minCoins = new int[amount + 1];
       Arrays.fill(minCoins, amount + 1);
       minCoins[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0){
                    minCoins[i] = Math.min(minCoins[i], minCoins[i - coins[j]] + 1);
                }
            }
        }
        return minCoins[amount] != amount ? minCoins[amount] : -1;
    }

}
