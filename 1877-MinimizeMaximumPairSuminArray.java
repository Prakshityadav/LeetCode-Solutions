// 1877 : Minimize Maximum Pair Sum in Array

class Solution {
    public int minPairSum(int[] nums) {
        int maxVal=100000;
        int[] freq=new int[maxVal+1];
        for(int num:nums){
            freq[num]++;
        }
        int left=0, right=maxVal;
        int sum=0;
        while(left<=right){
            while(left<=right && freq[left]==0)left++;
            while(left<=right && freq[right]==0)right--;

            if(left>right) break;

            sum=Math.max(sum,left+right);

            freq[left]--;
            freq[right]--;
        }
        return sum;
    }
}


//                                Solution using sorting


// import java.util.Arrays;

// class Method2 {
//     public int minPairSum(int[] nums) {
//         Arrays.sort(nums);
//         int sum=Integer.MIN_VALUE;
//         int n=nums.length-1;
//         for(int i=0;i<nums.length/2;i++){
//             sum=Math.max(sum,nums[i]+nums[n--]);
//         }
//         return sum;
//     }
// }