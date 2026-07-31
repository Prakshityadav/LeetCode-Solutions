class Solution {
    public boolean rotateString(String s, String goal) {
        
        for(int i=0;i<s.length();i++){
            String str=s.substring(i,s.length())+s.substring(0,i);
            // System.out.println(str);
            if(str.equals(goal)){
                return true;
            }
        }
        return false;
    }
}