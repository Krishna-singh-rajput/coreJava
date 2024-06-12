public class NumberOfCoinsRuppes {
    public static int minCoins(int[] coins, int target) {
        int[] dp = new int[target + 1];
        for (int i = 1; i <= target; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int coin : coins) {
            for (int i = coin; i <= target; i++) {
                if (dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[target];

    }
}

