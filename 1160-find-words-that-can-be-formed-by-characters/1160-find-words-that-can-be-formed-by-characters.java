class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] arr=new int[26];
        for(char c:chars.toCharArray()){
            arr[c-'a']++;
        }
        int count=0;
        for(String s:words){
            int[] temp=new int[26];
            for(char c:s.toCharArray()){
                temp[c-'a']++;
            }
            boolean flag=true;
            for(int i=0;i<26;i++){
                if(temp[i]>arr[i]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                count+=s.length();
            }
        }
        return count;
    }
}