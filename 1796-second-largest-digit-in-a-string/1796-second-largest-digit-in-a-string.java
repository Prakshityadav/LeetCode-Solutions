class Solution {
    public int secondHighest(String s) {
        int max=-1;
        int prev=-1;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                if(ch-'0'>max){
                    prev=max;
                    max=ch-'0';
                }else if(ch-'0'>prev && ch-'0'!=max){
                    prev=ch-'0';
                }
            }
        }
        return prev;
    }
}