class Solution {
    public int maxWidthRamp(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int maxWidth=0;

        for(int i=0;i<nums.length;i++){
            if(st.isEmpty() || nums[i]<nums[st.peek()]){
                st.push(i);
            }
        }

        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
                maxWidth=Math.max(maxWidth,i-st.pop());
            }
        }
        return maxWidth;
    }
}