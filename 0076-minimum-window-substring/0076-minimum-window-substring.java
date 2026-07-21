class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int uniqueChar=map.size();
        int startIndex=-1;
        int windowStart=0;
        int windowEnd=0;
        int minLen=Integer.MAX_VALUE;
        int n=s.length();

        while(windowEnd<n){
            // expanshion phase
            char ch=s.charAt(windowEnd);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0){
                    uniqueChar--;
                }
            }

            // Shrinking Phase

            while(uniqueChar==0){
                int len=windowEnd-windowStart+1;
                if(len<minLen){
                    minLen=len;
                    startIndex=windowStart;
                }
                ch=s.charAt(windowStart);
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                    if(map.get(ch)>0){
                        uniqueChar++;
                    }
                }
                windowStart++;
            }
            windowEnd++;
        }
        if(startIndex==-1) return "";
        return s.substring(startIndex,startIndex+minLen);
    }
}