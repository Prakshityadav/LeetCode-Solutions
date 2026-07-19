// Using Bucket sort
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequencies
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create buckets
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (int key : freq.keySet()) {
            int frequency = freq.get(key);

            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }

            bucket[frequency].add(key);
        }

        // Step 3: Collect top k elements
        int[] ans = new int[k];
        int index = 0;

        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {

            if (bucket[i] != null) {

                for (int num : bucket[i]) {

                    ans[index++] = num;

                    if (index == k)
                        break;
                }
            }
        }

        return ans;
    }
}


                        // Using PriorityQueue
// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {
//         HashMap<Integer, Integer> freq = new HashMap<>();

//         for (int num : nums) {
//             freq.put(num, freq.getOrDefault(num, 0) + 1);
//         }

//         PriorityQueue<Map.Entry<Integer, Integer>> pq =
//                 new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

//         pq.addAll(freq.entrySet());

//         int[] ans = new int[k];

//         for (int i = 0; i < k; i++) {
//             ans[i] = pq.poll().getKey();
//         }

//         return ans;
//     }
// }