// 1304 : Find N Unique Integers Sum up to Zero

class Solution {
    public int[] sumZero(int n) {
        int[] arr=new int[n];
        
        if(n%2==0){
            int x=1;
            int z=n-1;
            for(int i=0;i<n;i++){
                arr[i]=x;
                arr[z]=-x;
                x++;
                z--;
            }
        }else{
            int x=1;
            int z=n-1;
            arr[0]=0;
            for(int i=1;i<n;i++){
                arr[i]=-x;
                arr[z]=x;
                x++;
                z--;
            }
        }
        return arr;
    }
}

// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero
