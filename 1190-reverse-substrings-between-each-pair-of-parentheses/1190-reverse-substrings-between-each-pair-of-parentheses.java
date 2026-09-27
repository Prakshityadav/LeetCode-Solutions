class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                StringBuilder curr=new StringBuilder();
                while(!st.isEmpty() && st.peek()!='('){
                    curr.append(st.pop());
                }
                st.pop();
                for (int j = 0; j < curr.length(); j++) {
                    st.push(curr.charAt(j));
                }

            }else{
                st.push(s.charAt(i));
            }
            
        }
        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}