class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1=new int[nums.length];
        int[] arr2=new int[nums.length];
        int idx1=0;
        int idx2=0;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                arr1[idx1++]=nums[i];
                continue;
            }
            if(idx2==0){
                arr2[idx2++]=nums[i];
                continue;
            }
            if(arr1[idx1-1]>arr2[idx2-1]){
                arr1[idx1++]=nums[i];
            }else{
                arr2[idx2++]=nums[i];
            }
        }
        int j=0;
        for(int i=0;i<idx1;i++){
            nums[j++]=arr1[i];
        }
        for(int i=0;i<idx2;i++){
            nums[j++]=arr2[i];
        }
        return nums;
    }
}