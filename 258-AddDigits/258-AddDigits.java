// Last updated: 7/17/2026, 3:07:53 PM
class Solution {
    public int addDigits(int num) {
        if (num == 0)
        return 0;
        return 1+ (num -1) % 9;  
    }
}