// 11 : Container With Most Water
class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int maxArea=Integer.MIN_VALUE;
        while(start<end){
            maxArea=Math.max(maxArea,(end-start)*Math.min(height[start],height[end])); 
            if(height[start]<height[end]){
                start++;      
            }else{
                end--;
            }
        }
        return maxArea;
    }
}