class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;

        int[] arr=new int[m*n];;
        int total=m*n;
        int idx=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[(idx+k)%total]=grid[i][j];
                idx++;
            }
        }
        idx=0;
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<n;j++){
                temp.add(arr[idx]);
                idx++;
            }
            list.add(temp);
        }
        return list;
    }
}