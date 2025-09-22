// 3005 : Count Elements With Maximum Frequency

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr=new int[101];
        int max=0;
        for(int num:nums){
            arr[num]++;
            if(arr[num]>max){
                max=arr[num];
            }
        }
        int count=0;
        for(int i=0;i<101;i++){
            if(max==arr[i]){
                count++;
            }
        }
        return count*max;
    }
}