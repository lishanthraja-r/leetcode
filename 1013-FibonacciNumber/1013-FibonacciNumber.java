// Last updated: 7/17/2026, 3:07:05 PM
class Solution {
    public int fib(int n) {
        int prev1=0,prev2=1,curr=0;
        if(n<=1)
        return n;
        for(int i=2;i<=n;i++)
        {
            curr=prev1+prev2;
            prev1=prev2;
            prev2=curr;
        }
        return curr;
    }
}