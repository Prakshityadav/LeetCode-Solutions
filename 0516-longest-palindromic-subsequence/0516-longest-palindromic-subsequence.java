class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] memo = new int[n][n];
      
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
      
        return lpsRec(s, 0, n - 1, memo);
    }
    static int lpsRec(String s, int lo, int hi,int[][] memo){
      
        if (lo == hi)
            return 1;
        if (s.charAt(lo) == s.charAt(hi) && lo + 1 == hi)
            return 2;

        if (memo[lo][hi] != -1)
            return memo[lo][hi];

        if (s.charAt(lo) == s.charAt(hi))
            return memo[lo][hi]= lpsRec(s, lo + 1, hi - 1, memo) + 2;
      
        return memo[lo][hi]= Math.max(lpsRec(s, lo, hi - 1, memo),lpsRec(s, lo + 1, hi, memo));
    }
}