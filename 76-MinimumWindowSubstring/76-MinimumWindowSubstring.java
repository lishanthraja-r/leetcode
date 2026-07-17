// Last updated: 7/17/2026, 3:09:21 PM
class Solution {
    public String minWindow(String s, String t) {
        int freq[] = new int[128];
        for(char ch: t.toCharArray()){
            freq[ch]++;
        }

        int left = 0;
        int start = 0;
        int count = t.length();
        int minLen = Integer.MAX_VALUE;
        for(int right = 0; right < s.length(); right++){
            if(freq[s.charAt(right)] > 0){
                count--;
            }
            freq[s.charAt(right)]--;

            while(count == 0){
                if(right - left + 1 < minLen){
                    minLen = right - left + 1;
                    start = left;
                }

                freq[s.charAt(left)]++;

                if(freq[s.charAt(left)] > 0){
                    count++;
                }

                left++;
            }
        }
        return minLen == Integer.MAX_VALUE? "" : s.substring(start, start + minLen);
    }
}

/*
--- BRUTE FORCE ---

class Solution {
    public String minWindow(String s, String t) {
        String result = "";
        int minLen = Integer.MAX_VALUE;
        for(int i = 0;  i < s.length(); i++){
            for(int j = i + 1; j <= s.length(); j++){
                String sub = s.substring(i, j);

                if(isValid(sub, t)){
                    if(sub.length() < minLen){
                        minLen = sub.length();
                        result = sub;
                    }
                }
            }
        }
        return result;
    }
    public boolean isValid(String sub, String t){
        int[] freq = new int[128];

        for(char c : sub.toCharArray()){
            freq[c]++;
        }

        for(char c : t.toCharArray()){
            if(freq[c] == 0) return false;
            freq[c]--;
        }

        return true;
    }
}*/