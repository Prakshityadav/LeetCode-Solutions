class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,List<Integer>>  map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.computeIfAbsent(nums[i],k-> new ArrayList<>()).add(i);
        }
        int count=0;
        for(List<Integer> list:map.values()){
            if(list.size()!=3) continue;
            int d1=list.get(2)-list.get(1);
            int d2=list.get(1)-list.get(0);
            if(d1==d2) count++;
        }
        return count;
    }
}