class Solution {
    public int longestPalindromeSubseq(String s) {
        String rev=new StringBuilder(s).reverse().toString();
        int n=s.length();
        int[][] dp=new int[n+1][n+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                if(s.charAt(i-1)==rev.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][n];
    }
}
// To get palindromic String
class Solution1 {

    public String longestPalindromeSubseq(String s) {

        String rev = new StringBuilder(s).reverse().toString();
        int n = s.length();

        int[][] dp = new int[n + 1][n + 1];

        // Create DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (s.charAt(i - 1) == rev.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Backtracking to get the string
        StringBuilder str = new StringBuilder();

        int i = n;
        int j = n;

        while (i > 0 && j > 0) {

            if (s.charAt(i - 1) == rev.charAt(j - 1)) {
                str.append(s.charAt(i - 1));
                i--;
                j--;
            } 
            else if (dp[i - 1][j] >= dp[i][j - 1]) {
                i--;
            } 
            else {
                j--;
            }
        }

        return str.reverse().toString();
    }
}