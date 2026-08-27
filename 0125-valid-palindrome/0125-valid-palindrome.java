class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String str="";
        for(char c:s.toCharArray()){
            if(Character.isLetter(c) || Character.isDigit(c)){
                str+=c;
            }
        }
        StringBuilder sb=new StringBuilder(str);
        if(str.equals(sb.reverse().toString())){
            return true;
        }
        return false;
    }
}