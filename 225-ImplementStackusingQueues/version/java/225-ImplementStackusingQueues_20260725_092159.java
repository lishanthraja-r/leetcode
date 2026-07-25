// Last updated: 7/25/2026, 9:21:59 AM
1class Solution {
2    public List<String> summaryRanges(int[] nums) {
3        
4        List<String> res = new ArrayList<>();
5    
6        int i = 0;
7        int first;
8        int last;
9        StringBuilder s = new StringBuilder();
10
11        while( i < nums.length){
12            first = nums[i];
13            int temp = first;
14
15            while( ++i < nums.length && temp+1 == nums[i])
16                temp += 1;
17            
18            last = temp;
19            
20            if( first == last )
21                s.append(first);
22            else{
23                s.append(first);
24                s.append("->");
25                s.append(last);
26            }
27            res.add(s.toString());
28            s.setLength(0);
29
30        }
31
32        return res;
33    }
34}
35
36/*
37    Always use stringBuilder, instead of string
38        - This will reduce the runtime
39*/