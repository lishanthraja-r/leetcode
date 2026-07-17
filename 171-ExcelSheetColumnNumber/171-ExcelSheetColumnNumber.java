// Last updated: 7/17/2026, 3:08:35 PM
class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            sum = sum * 26 + ((columnTitle.charAt(i) - 'A') + 1);
        }

        return sum;
    }
}