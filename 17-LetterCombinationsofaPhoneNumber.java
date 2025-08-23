// 17 : Letter Combinations of a Phone Number
import java.util.ArrayList;
import java.util.List;

class Solution {
    public static String[] keypad = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;
        comb(digits, 0, "", result);
        return result;
    }

    void comb(String str, int idx, String current, List<String> result) {
        if (idx == str.length()) {
            result.add(current);
            return;
        }

        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            comb(str, idx + 1, current + mapping.charAt(i), result);
        }
    }
}
// This code generates all possible letter combinations that a given digit string could represent on a phone keypad.