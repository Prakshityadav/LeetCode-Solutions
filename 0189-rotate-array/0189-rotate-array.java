class Solution {
    static void swap(int[] nums,int idx1,int idx2){
        int t=nums[idx1];
        nums[idx1]=nums[idx2];
        nums[idx2]=t;
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int start=0;
        int end=nums.length-1;
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
        int a=0;
        int b=k-1;
        while(a<b){
            swap(nums,a,b);
            a++;
            b--;
        }
        int c=k;
        int d=nums.length-1;
        while(c<d){
            swap(nums,c,d);
            c++;
            d--;
        }
        System.out.print(nums);
    }
}