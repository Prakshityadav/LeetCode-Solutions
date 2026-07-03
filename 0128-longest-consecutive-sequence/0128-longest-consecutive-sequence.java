class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int maxLen=0;
        for(int num:set){
            if(!set.contains(num-1)){
            int curr=0;
            int nextNum=num;
            while(set.contains(nextNum)){
                curr++;
                nextNum++;
            }
            
            maxLen=Math.max(maxLen,curr);
            }
        }
        return maxLen;
    }
}