class Solution {
    public int climbStairs(int n) {
        Integer[] dp = new Integer[n+1];
        return help(n, dp);
    }

    public int help(int n, Integer[] dp) {
        if(n<3) dp[n] = n;
        if(dp[n] != null) return dp[n];
        return dp[n] = help(n-1, dp) + help(n-2, dp);
    }
}
