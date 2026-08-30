class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int minIndex=0;
        int max=Integer.MIN_VALUE;
        int maxIndex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                maxIndex=i;
            }
            if(nums[i]<min){
                min=nums[i];
                minIndex=i;
            }
        }
        int left=Math.min(minIndex,maxIndex);
        int right=Math.max(minIndex,maxIndex);

        int option1=right+1;
        int option2=nums.length-left;

        int option3=left+1+nums.length-right;
        return Math.min(option1, Math.min(option2, option3));
    }
}