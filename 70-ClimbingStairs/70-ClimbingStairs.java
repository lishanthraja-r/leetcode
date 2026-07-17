// Last updated: 7/17/2026, 3:09:22 PM
class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;

        int a = 1; // ways to reach step 1
        int b = 2; // ways to reach step 2

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
}
