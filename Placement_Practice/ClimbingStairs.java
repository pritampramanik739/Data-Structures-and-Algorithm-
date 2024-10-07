public class ClimbingStairs {

    public static void main(String[] args) {
        int n = 4; // Example input
        System.out.println( countWays(n));
    }

    public static int countWays(int n) {
        if (n <= 1) return 1;

        int[] dp = new int[n + 1];
        dp[0] = 1; // Base case: 1 way to stay at the ground (0th stair)
        dp[1] = 1; // Base case: 1 way to reach the 1st stair

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}

