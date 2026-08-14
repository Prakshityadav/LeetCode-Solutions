class Solution {
    public int maximumLengthSubstring(String s) {
        int[] arr=new int[26];
        int left=0;
        int maxlen=-1;
        for(int right=0;right<s.length();right++){
            int idx=s.charAt(right)-'a';
            arr[idx]++;
            while(arr[idx]>2){
                arr[s.charAt(left)-'a']--;
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}