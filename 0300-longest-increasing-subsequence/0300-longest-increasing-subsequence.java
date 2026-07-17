class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp=new int[nums.length][nums.length+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(0,-1,nums,dp);
    }
    int solve(int idx,int prev,int[] nums,int[][] dp){
        if(idx==nums.length) return 0;
        int take=Integer.MIN_VALUE;
        if(dp[idx][prev+1]!=-1) return dp[idx][prev+1];
        if(prev==-1||nums[prev]<nums[idx]){
            take=1+solve(idx+1,idx,nums,dp);
        }
        int not=solve(idx+1,prev,nums,dp);
        return dp[idx][prev+1]=Math.max(take,not);
    }
}