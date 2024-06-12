public class MinimumNumberOfCoin {

    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        int target = 30;
        System.out.println("Minimum number of coins needed: " + minCoins(coins, target));
    }
}