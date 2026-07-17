// Last updated: 7/17/2026, 3:07:59 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        return (n%2==0) && isPowerOfTwo(n/2);
    }
}