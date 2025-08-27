// 3000 : Maximum Area of Longest Diagonal Rectangle

class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int result = 0;
        int maxDiagonalSq = 0; 

        for (int i = 0; i < dimensions.length; i++) {
            int length = dimensions[i][0];
            int width = dimensions[i][1];

            int diagonalSq = length * length + width * width; 
            int area = length * width;

            if (diagonalSq > maxDiagonalSq || (diagonalSq == maxDiagonalSq && area > result)) {
                maxDiagonalSq = diagonalSq;
                result = area;
            }
        }
        return result;
    }
}
