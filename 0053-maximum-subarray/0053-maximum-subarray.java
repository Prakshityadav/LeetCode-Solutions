class Solution {
    public int maxSubArray(int[] nums) {
        int prevsum=nums[0];
        int currsum=nums[0];
        for(int i=1;i<nums.length;i++){
           currsum=Math.max(nums[i],currsum+nums[i]);
            prevsum=Math.max(prevsum,currsum);
        }
        return prevsum;
    }
}