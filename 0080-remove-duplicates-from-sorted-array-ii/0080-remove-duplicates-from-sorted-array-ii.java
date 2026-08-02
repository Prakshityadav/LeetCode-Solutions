class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        
        int j = 1; // pointer for modifying array
        int count = 1; // count of current element appearances
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1; // reset count for new element
            }
            
            // Place the element if it appears at most twice
            if (count <= 2) {
                nums[j] = nums[i];
                j++;
            }
        }
        
        return j;
    }
}