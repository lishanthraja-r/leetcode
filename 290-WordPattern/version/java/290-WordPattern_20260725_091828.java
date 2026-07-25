// Last updated: 7/25/2026, 9:18:28 AM
1class Solution {
2    public boolean wordPattern(String pattern, String s) {
3        String[] words = s.split(" ");
4        if (words.length != pattern.length()) {
5            return false;
6        }
7
8        Map<Character, String> charToWord = new HashMap<>();
9        Map<String, Character> wordToChar = new HashMap<>();
10
11        for (int i = 0; i < pattern.length(); i++) {
12            char c = pattern.charAt(i);
13            String word = words[i];
14
15            if (!charToWord.containsKey(c)) {
16                charToWord.put(c, word);
17            }
18
19            if (!wordToChar.containsKey(word)) {
20                wordToChar.put(word, c);
21            }
22
23            if (!charToWord.get(c).equals(word) || !wordToChar.get(word).equals(c)) {
24                return false;
25            }
26        }
27
28        return true;        
29    }
30}