package Dynamic_Programming;

import java.util.*;

/**
 * ClimbingStairs
 */

class Solution {

    // Recursive Approach
    public static int countWays(int n){
        if(n == 0 || n == 1) return 1;

        int first = countWays(n-1);
        int second = countWays(n-2);
        return first + second;
    }

    // Memoiazation
    public static int countWaysMem(int n,int [] dp){
        if(n == 0 || n == 1) return 1;
        if(dp[n] != -1) return dp[n];

        int first = countWaysMem(n-1, dp);
        int second = countWaysMem(n-1, dp);
        return dp[n] = first + second;
    }

    // Tabulation Method
    public static int countWaysTab(int n){
        if(n == 0 || n == 1) return 1;

        int[] dp = new int[n+1];
        dp[0] = 1; 
        dp[1] = 1;        
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    // Space Optimzation Methods

    public static int countWaysSpaceOpt(int n){
        if(n == 0 || n == 1) return 1;

        int first = 1;
        int second = 1;

        for(int i=2; i<=n; i++){
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }
}

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int ans = Solution.countWaysSpaceOpt(n);
        System.out.println("Count of ways (Space Optimzed) are: " + ans);
        sc.close();
    }
}