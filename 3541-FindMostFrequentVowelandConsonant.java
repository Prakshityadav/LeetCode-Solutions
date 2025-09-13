// 3541 : Find Most Frequent Vowel and Consonant

class Solution {
    public int maxFreqSum(String s) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        int vowel=0;
        int constant=0;
        for(int i=0;i<26;i++){
            if(i==0 || i==4 || i==14 || i==20 || i==8){
                vowel=Math.max(vowel,arr[i]);
            }else{
                constant=Math.max(constant,arr[i]);
            }
        }
        return vowel+constant;
    }
}
