class Solution {
    public double average(int[] salary) {
        int n=salary.length;
        double sum=0;
        double max=Double.MIN_VALUE;
        double min=Double.MAX_VALUE;
        for(int num:salary){
            sum+=num;
            min=Math.min(min,num);
            max=Math.max(num,max);
        }
        return (sum-(min+max))/(n-2);
    }
}