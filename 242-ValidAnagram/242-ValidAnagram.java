// Last updated: 7/17/2026, 3:07:55 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int n : count) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }
}