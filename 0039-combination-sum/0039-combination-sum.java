class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, 0, new ArrayList<>(), result, target);
        return result;
    }

    void backtrack(int[] num, int index, List<Integer> curr,
                   List<List<Integer>> result, int target) {

        if (target == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }

        if (target < 0) return;

        for (int i = index; i < num.length; i++) {
            curr.add(num[i]);  
            backtrack(num, i, curr, result, target - num[i]); 
            curr.remove(curr.size() - 1); 
        }
    }
}
