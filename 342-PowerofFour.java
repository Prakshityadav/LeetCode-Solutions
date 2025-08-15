// 342: Power of Four

class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        return n>0 && (n&(n-1))==0 && (n-1)%3==0;
    }
}