class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            int max=maxNum1(nums,i);
            int min=minNum1(nums,i,nums.length);
            if(max-min<=k){
                return i;
            }
        }
        return -1;
    }
    int maxNum1(int[] nums,int j){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=j;i++){
            max=Math.max(max,nums[i]);
        }
        return max;
    }
    int minNum1(int[] nums,int i,int j){
        int min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            min=Math.min(min,nums[k]);
        }
        return min;
    }
}