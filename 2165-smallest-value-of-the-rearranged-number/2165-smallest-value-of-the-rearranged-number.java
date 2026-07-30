class Solution {
    public long smallestNumber(long num) {
        if(num==0) return 0;

        boolean negative=num<0;
        char[] digits=Long.toString(Math.abs(num)).toCharArray();
        Arrays.sort(digits);

        if(negative){
            StringBuilder sb=new StringBuilder();
            for(int i=digits.length-1;i>=0;i--){
                sb.append(digits[i]);
            }
            return -Long.parseLong(sb.toString());
        }else{
            int idx=0;
            while(digits[idx]=='0'){
                idx++;
            }
            
            StringBuilder sb=new StringBuilder();
            sb.append(digits[idx]);
            for(int i=0;i<idx;i++){
                sb.append('0');
            }
            for(int i=idx+1;i<digits.length;i++){
                sb.append(digits[i]);
            }
            return Long.parseLong(sb.toString());
        }
    }
}