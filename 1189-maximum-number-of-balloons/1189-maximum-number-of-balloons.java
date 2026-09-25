class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] arr=new int[26];
        for(char c:text.toCharArray()){
            arr[c-'a']++;
        }

        int ans=Math.min(arr[0],arr[1]);
        ans=Math.min(ans,arr[11]/2);
        ans=Math.min(ans,arr[14]/2);
        ans=Math.min(ans,arr[13]);
        return ans;
    }
}