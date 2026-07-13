class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s = "123456789";
        List<Integer> ans = new ArrayList<>();

        int lowLen = String.valueOf(low).length();
        int highLen = String.valueOf(high).length();

        for (int len = lowLen; len <= highLen; len++) {
            for (int i = 0; i + len <= 9; i++) {
                int num = Integer.parseInt(s.substring(i, i + len));

                if (num >= low && num <= high) {
                    ans.add(num);
                }
            }
        }

        return ans;
    }
}
// class Solution {
//     public int maxSubarraySumCircular(int[] nums) {

//         int total = 0;

//         int curMax = 0, maxSum = nums[0];
//         int curMin = 0, minSum = nums[0];

//         for (int num : nums) {
//             total += num;

//             curMax = Math.max(num, curMax + num);
//             maxSum = Math.max(maxSum, curMax);

//             curMin = Math.min(num, curMin + num);
//             minSum = Math.min(minSum, curMin);
//         }

//         // All numbers are negative
//         if (maxSum < 0)
//             return maxSum;

//         return Math.max(maxSum, total - minSum);
//     }
// }