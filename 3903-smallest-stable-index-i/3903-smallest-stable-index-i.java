class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] prefix=new int[n];
        int[] suffix=new int[n];

        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=Math.max(nums[i],prefix[i-1]);
        }

        suffix[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i]=Math.min(nums[i],suffix[i+1]);
        }
        for(int i=0;i<n;i++){
            if(prefix[i]-suffix[i]<=k) return i;
        }
        return -1;
    }
}




// brute force
class Solution1 {
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