class Solution {
//     A knight always moves to a square of the opposite color.
//     So:
//          Even number of moves ⇒ start and end squares have the same color.
//          Odd number of moves ⇒ start and end squares have different colors.
    public boolean canReach(int[] start, int[] target) {
        return (start[0]+start[1])%2==(target[0]+target[1])%2;
    }
}