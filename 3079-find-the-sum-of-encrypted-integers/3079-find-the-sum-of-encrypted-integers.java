class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int num : nums){
            int enc=encript(num);
            sum+=enc;
        }
        return sum;
    }
    int encript(int num){
        int max=-1;
        int count=0;
        while(num>0){
            int x=num%10;
            count++;
            max=Math.max(max,x);
            num/=10;
        }
        int s=0;
        for(int i=0;i<count;i++){
            s=s*10+max;
        }
        return s;
    }
}