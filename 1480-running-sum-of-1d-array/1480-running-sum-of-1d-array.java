class Solution {
    public int[] runningSum(int[] nums) {
        int s=nums.length;
        for(int i=1;i<s;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }
}