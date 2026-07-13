class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int maxKadane = kadaneMax(nums);
        int minKadane = kadaneMin(nums);

        for (int num : nums) {
            total += num;
        }

        if (maxKadane < 0) return maxKadane;

        return Math.max(maxKadane, total - minKadane);
    }

    int kadaneMax(int[] nums) {
        int curr = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i], curr + nums[i]);
            max = Math.max(max, curr);
        }

        return max;
    }

    int kadaneMin(int[] nums) {
        int curr = nums[0];
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            curr = Math.min(nums[i], curr + nums[i]);
            min = Math.min(min, curr);
        }

        return min;
    }
}