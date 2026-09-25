class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int[] arr=new int[101];
        for(int num:nums){
            arr[num]++;
        }
        int sum=0;
        for(int i=1;i<=100;i++){
            if(arr[i]%k==0){
                sum+=arr[i]*i;
            }
        }
        return sum;
    }
}