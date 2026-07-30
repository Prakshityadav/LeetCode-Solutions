class Solution {
    public int minimumPushes(String word) {
        if(word.length()<=8) return word.length();
        int n=word.length();
        int result=0;
        int c=1;
        while(n>8){
            result+=8*c;
            c++;
            n-=8;
        }
        return result+n*c;
    }
}