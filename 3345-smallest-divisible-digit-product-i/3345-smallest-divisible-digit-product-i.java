class Solution {
    public int smallestNumber(int n, int t) {
        if(sumDigit(n)%t==0) return n;
        while(sumDigit(n)%t!=0){
            n++;
        }
        return n;
    }
    int sumDigit(int n){
        int num=1;
        while(n>0){
            int rem=n%10;
            num*=rem;
            n/=10;
        }
        return num;
    }
}