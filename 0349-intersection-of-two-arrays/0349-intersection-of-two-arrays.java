class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] boolArr = new boolean[1001];
        for(int n : nums1) {
            boolArr[n] = true;
        }
        int idx = 0;
        for(int n : nums2) {
            if(boolArr[n] == true) {
                nums1[idx++] = n;
                boolArr[n] = false;
            }
        }
        int[] interArr = new int[idx];
        for(int i=0; i<idx; i++) {
            interArr[i] = nums1[i];
        }
        return interArr;
    }
}