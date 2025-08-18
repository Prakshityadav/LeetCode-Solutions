// 5 : Longest Palindromic Substring

class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0) return "";
        
        boolean[][] dp = new boolean[n][n];
        int start = 0, maxLength = 1;
        
       
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

       
        for (int length = 2; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;
                
                if (length == 2) {
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                } else {
                   
                    dp[i][j] = (s.charAt(i) == s.charAt(j)) && dp[i + 1][j - 1];
                }
                if (dp[i][j] && length > maxLength) {
                    start = i;
                    maxLength = length;
                }
            }
        }
        
        return s.substring(start, start + maxLength);
    }
}
// This code finds the longest palindromic substring in a given string.