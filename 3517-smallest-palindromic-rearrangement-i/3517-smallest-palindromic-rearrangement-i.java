class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int[] count=new int[26];

        for(char ch:s.toCharArray()){
            count[ch-'a']++;
        }

        StringBuilder left=new StringBuilder();
        StringBuilder mid=new StringBuilder();

        for(int i=0;i<26;i++){
            for(int j=0;j<count[i]/2;j++){
                left.append((char)('a'+i));
            }

            if(count[i]%2==1){
                mid.append((char)('a'+i));
            }
        }

        StringBuilder right=new StringBuilder(left).reverse();
        return left.toString()+mid.toString()+right.toString();
    }
}