//2264: Largest 3-Same-Digit Number in String

class Solution {
    public String largestGoodInteger(String num) {
        String result="";
        int val=0;
        for(int i=0;i<num.length()-2;i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2)){
                int n=num.charAt(i)-'0'+num.charAt(i+1)-'0'+num.charAt(i+2)-'0';
                if(val<=n){
                    String str=""+num.charAt(i)+num.charAt(i+1)+num.charAt(i+2);
                    result=str;
                    val=n;
                }
            }
        }
        return result;
    }
}