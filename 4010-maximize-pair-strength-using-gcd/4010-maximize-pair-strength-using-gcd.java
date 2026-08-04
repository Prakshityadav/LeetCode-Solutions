class Solution {
    public long maxPairStrength(int[] nums) {
        long max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long x=gcd(nums[i],nums[j]);
                long num=((long)nums[i]*nums[j])/(x*x);
                max=Math.max(num,max);
            }
        }
        return max;
    }
    long gcd(long a,long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}