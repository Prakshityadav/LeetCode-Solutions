// Problem 869: Reordered Power of 2

class Solution {
    public boolean reorderedPowerOf2(int n) {

        char[] chars = String.valueOf(n).toCharArray();
        java.util.Arrays.sort(chars);
        String sorted = new String(chars);

        for (int i = 0; i < 31; i++) {
            
            char[] powChars = String.valueOf(1 << i).toCharArray();
            java.util.Arrays.sort(powChars);

            if (sorted.equals(new String(powChars))) {
                return true;
            }

        }

        return false;
    }
}
