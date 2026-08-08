class Solution {

    public int orangesRotting(int[][] grid) {

        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {

                if(grid[i][j] == 2) {
                    q.add(new int[]{i, j});
                }
                if(grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        // If no fresh oranges
        if(fresh == 0) return 0;

        int minutes = 0;

        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

        while(!q.isEmpty()) {

            int size = q.size();
            boolean rotted = false;

            for(int i = 0; i < size; i++) {

                int[] cell = q.poll();
                int r = cell[0];
                int c = cell[1];

                for(int[] dir : directions) {
                    int nr = r + dir[0];
                    int nc = c + dir[1];

                    if(nr >= 0 && nc >= 0 &&
                       nr < rows && nc < cols &&
                       grid[nr][nc] == 1) {

                        grid[nr][nc] = 2;
                        fresh--;
                        q.add(new int[]{nr, nc});
                        rotted = true;
                    }
                }
            }

            if(rotted) minutes++;
        }

        return fresh == 0 ? minutes : -1;
    }
}
