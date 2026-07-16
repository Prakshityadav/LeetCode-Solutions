class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> list=new ArrayList<>();

        int first=grid[0][0];

        for(int[] row:grid){
            for(int num:row){

                if((num-first)%x!=0) return -1;
                list.add(num);
            }
        }
        Collections.sort(list);

        int median=list.get(list.size()/2);

        int operation=0;

        for(int num:list){
            operation+=Math.abs(num-median)/x;
        }
        return operation;
    }
}