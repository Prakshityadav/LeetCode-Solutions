class Solution {
    public long sumAndMultiply(int n) {
        long ans=0;
        long sum=0;
        StringBuilder sb=new StringBuilder(String.valueOf(n));
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='0'){
                continue;
            }
            ans=ans*10+sb.charAt(i)-'0';
            sum+=sb.charAt(i)-'0';
        }
        return ans*sum;
    }
}