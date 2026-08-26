class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left=0;
        int count=0;
        String ans="";
        for(int right=0;right<s.length();right++){
            if(s.charAt(right)=='1'){
                count++;
            }
            while(count==k){
                while(left<=right && s.charAt(left)=='0'){
                    left++;
                }
                String str=s.substring(left,right+1);

                if(ans.equals("") || str.length()<ans.length() || str.length()==ans.length() && str.compareTo(ans)<0){
                    ans=str;
                }
                if(s.charAt(left)=='1'){
                    count--;
                }
                left++;
            }
            
        }
        return ans;
    }
}