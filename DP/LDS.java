public static int[] LDS(int[] arr) {
    int n = arr.length;
    int[] dp = new int[n];
    int len = 0;
    for (int i = n - 1; i >= 0; i--) {
        dp[i] = 1;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[i]) {
                dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }

        len = Math.max(len, dp[i]);
    }

    return dp;
}
