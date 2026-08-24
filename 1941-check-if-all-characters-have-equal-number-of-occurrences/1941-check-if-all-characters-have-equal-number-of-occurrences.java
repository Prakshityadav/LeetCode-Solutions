class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] arr=new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        int x=-1;
        for(int i=0;i<26;i++){
            if(arr[i]>0){
                if(x==-1){
                    x=arr[i];
                }else if(x!=arr[i]){
                return false;
            }
            }
            
        }
        return true;
    }
}