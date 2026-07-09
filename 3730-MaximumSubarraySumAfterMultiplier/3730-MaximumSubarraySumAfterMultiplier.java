// Last updated: 7/9/2026, 10:06:20 AM
class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long[] original = new long[n];
        long[] multiplied = new long[n];
        long[] divided = new long[n];
        
        for (int i = 0; i < n; i++) {
            original[i] = nums[i];
            multiplied[i] = nums[i] * (long) k;
            // Floor division for positive, ceiling division for negative
            if (nums[i] >= 0) {
                divided[i] = nums[i] / k;
            } else {
                // Ceiling division for negatives: ceil(a/b) = -floor((-a)/b)
                // Or equivalently: (a + b + 1) / b doesn't work for negatives
                divided[i] = (long) Math.ceilDiv(nums[i], k);
            }
        }
        
        // Kadane's algorithm with states
        long[][] dp = new long[n][4];
        long result = Long.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            // State 0: Before any operation
            dp[i][0] = original[i];
            if (i > 0 && dp[i-1][0] > 0) {
                dp[i][0] = dp[i-1][0] + original[i];
            }
            result = Math.max(result, dp[i][0]);
            
            // State 1: During multiplication
            dp[i][1] = multiplied[i];
            if (i > 0) {
                if (dp[i-1][1] > 0) {
                    dp[i][1] = Math.max(dp[i][1], dp[i-1][1] + multiplied[i]);
                }
                if (dp[i-1][0] > 0) {
                    dp[i][1] = Math.max(dp[i][1], dp[i-1][0] + multiplied[i]);
                }
            }
            result = Math.max(result, dp[i][1]);
            
            // State 2: During division
            dp[i][2] = divided[i];
            if (i > 0) {
                if (dp[i-1][2] > 0) {
                    dp[i][2] = Math.max(dp[i][2], dp[i-1][2] + divided[i]);
                }
                if (dp[i-1][0] > 0) {
                    dp[i][2] = Math.max(dp[i][2], dp[i-1][0] + divided[i]);
                }
            }
            result = Math.max(result, dp[i][2]);
            
            // State 3: After operation finished
            dp[i][3] = original[i];
            if (i > 0) {
                if (dp[i-1][3] > 0) {
                    dp[i][3] = Math.max(dp[i][3], dp[i-1][3] + original[i]);
                }
                if (dp[i-1][1] > 0) {
                    dp[i][3] = Math.max(dp[i][3], dp[i-1][1] + original[i]);
                }
                if (dp[i-1][2] > 0) {
                    dp[i][3] = Math.max(dp[i][3], dp[i-1][2] + original[i]);
                }
            }
            result = Math.max(result, dp[i][3]);
        }
        
        return result;
    }
}