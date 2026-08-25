class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int rowStart = 0, rowEnd = n - 1, columnStart = 0, columnEnd = m - 1;

        while (rowStart <= rowEnd && columnStart <= columnEnd) {
            // Traverse Right
            for (int col = columnStart; col <= columnEnd; col++) {
                result.add(matrix[rowStart][col]);
            }
            rowStart++;

            // Traverse Down
            for (int row = rowStart; row <= rowEnd; row++) {
                result.add(matrix[row][columnEnd]);
            }
            columnEnd--;

            // Traverse Left
            if (rowStart <= rowEnd) {
                for (int col = columnEnd; col >= columnStart; col--) {
                    result.add(matrix[rowEnd][col]);
                }
                rowEnd--;
            }

            // Traverse Up
            if (columnStart <= columnEnd) {
                for (int row = rowEnd; row >= rowStart; row--) {
                    result.add(matrix[row][columnStart]);
                }
                columnStart++;
            }
        }

        return result;
    }
}
