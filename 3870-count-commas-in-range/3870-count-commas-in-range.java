class Solution {
    public int countCommas(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(i<1000) continue;
            int len=(int)Math.log10(i);
            count+=len/3;
        }
        return count;
    }
}