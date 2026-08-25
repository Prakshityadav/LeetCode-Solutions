class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int i=1;
        while(k<=100){
            if(!set.contains(i*k)) return k*i;
            i++;
        }
        return -1;
    }
}