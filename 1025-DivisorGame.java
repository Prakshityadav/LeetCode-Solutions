// 1025. Divisor Game

class Solution {
    public boolean divisorGame(int n) {
        return n%2==0;
    }
}

// class Solution {
//     public boolean divisorGame(int n) {
//         boolean[] dp = new boolean[n + 1];

//         dp[1] = false; 

//         for (int i = 2; i <= n; i++) {
//             for (int x = 1; x < i; x++) {
//                 if (i % x == 0) {
//                     if (!dp[i - x]) {
//                         dp[i] = true;
//                         break;
//                     }
//                 }
//             }
//         }

//         return dp[n];
//     }
// }