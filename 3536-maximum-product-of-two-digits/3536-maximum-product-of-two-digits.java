class Solution {
    public int maxProduct(int n) {
        String str=String.valueOf(n);
        int max1=0;
        int max2=0;
        for(char c:str.toCharArray()){
            int x=c-'0';
            if(x>=max1){
                max2 = max1;
                max1=x;
            }else if(x>max2){
                max2=x;
            }
        }
        return max1*max2;
    }
}