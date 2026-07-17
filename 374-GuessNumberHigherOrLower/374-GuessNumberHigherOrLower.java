// Last updated: 7/17/2026, 3:07:41 PM
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        if (n == 1) return 1;
        int low = 1, high = n;
        while (low <= high){
            int mid = low + (high - low) / 2;
            int check = guess(mid);
            if (check == 0) return mid;
            else if (check == 1) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}