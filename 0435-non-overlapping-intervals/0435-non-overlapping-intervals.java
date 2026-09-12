class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count=0;
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);

        int[] prev=intervals[0];
        for(int i=1;i<intervals.length;i++){
            int[] interval=intervals[i];
            if(interval[0]<prev[1]){
                count++;
                if(interval[1]<prev[1]){
                    prev=interval;
                }
            }else{
                prev=interval;
            }
        }
        return count;
    }
}