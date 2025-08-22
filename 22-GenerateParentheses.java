// 22 : Generate Parentheses
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();

        recursion(0,0,"",n,result);
        return result;
    }
    void recursion(int open,int close,String str,int n,List<String> result){
        if( open==close&&open+close==n*2){
            result.add(str);
            return;
        }

        if(open<n){
            recursion(open+1,close,str+ "(",n,result);
        }
        if(close<open){
            recursion(open,close+1,str+ ")",n,result);
        }
    }
}