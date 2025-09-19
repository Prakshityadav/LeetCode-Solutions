// 3484 : Design Spreadsheet

class Spreadsheet {
    public static int[][] arr;
    public Spreadsheet(int rows) {
        arr=new int[rows][26];
    }
    
    public void setCell(String cell, int value) {
        char c=cell.charAt(0);
        String str=cell.substring(1);
        arr[Integer.parseInt(str)-1][c-'A']=value;
    }
    
    public void resetCell(String cell) {
        char c=cell.charAt(0);
        String str=cell.substring(1);
        arr[Integer.parseInt(str)-1][c-'A']=0;
    }
    
    public int getValue(String formula) {
        String s=formula.substring(1);
        String s1="";
        String s2="";
        int i=0;
        boolean t=false;
        while(s.charAt(i)!='+'){
            s1+=s.charAt(i);
            i++;
        }
        s2=s.substring(i+1);
        if(onlyDigits(s1) && onlyDigits(s2)){
            return Integer.parseInt(s1)+Integer.parseInt(s2);
        }else if(!onlyDigits(s1) && onlyDigits(s2)){
            char c=s1.charAt(0);
            String str=s1.substring(1);
            return arr[Integer.parseInt(str)-1][c-'A']+Integer.parseInt(s2);
        }else if(onlyDigits(s1) && !onlyDigits(s2)){
            char c=s2.charAt(0);
            String str=s2.substring(1);
            return arr[Integer.parseInt(str)-1][c-'A']+Integer.parseInt(s1);
        }
        char c=s2.charAt(0);
        String str=s2.substring(1);
        char c1=s1.charAt(0);
        String str1=s1.substring(1);
        return arr[Integer.parseInt(str)-1][c-'A']+arr[Integer.parseInt(str1)-1][c1-'A'];
    }
    public static boolean onlyDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false; 
            }
        }
        return true;  
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */
